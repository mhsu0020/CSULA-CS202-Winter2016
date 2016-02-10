import java.util.ArrayList;
import java.util.List;

public class DumbAI2 implements PlayTicTacToe {

	List<Move> AIMoves;

	public DumbAI2() {
		AIMoves = new ArrayList<>();
	}

	public boolean moveIfPossible(String[][] board, int row, int col, String symbol) {
		if (row >= 0 && row < board.length && col >= 0 && col < board[0].length) {
			if (board[row][col].equals("_")) {
				board[row][col] = symbol;
				AIMoves.add(new Move(row, col));
				System.out.println("AI placed move at " + row + "," + col);
				return true;

			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String[][] takeTurn(String[][] currentBoard, String symbol) {

		// Dumb AI: place move at first available spot adjacent to previous move
		if (AIMoves.size() > 0) {
			Move lastMove = AIMoves.get(AIMoves.size() - 1);
			int lastMoveRow = lastMove.getRow();
			int lastMoveCol = lastMove.getColumn();

			// Place move at top of last move if possible
			if (moveIfPossible(currentBoard, lastMoveRow - 1, lastMoveCol, symbol)) {
				return currentBoard;

			}
			// Bottom
			else if (moveIfPossible(currentBoard, lastMoveRow + 1, lastMoveCol, symbol)) {
				return currentBoard;

			}
			// right
			else if (moveIfPossible(currentBoard, lastMoveRow, lastMoveCol + 1, symbol)) {
				return currentBoard;

			}
			// left
			else if (moveIfPossible(currentBoard, lastMoveRow, lastMoveCol + 1, symbol)) {
				return currentBoard;

			}

		}

		// Four directions no valid move, move to first available spot

		for (int i = 0; i < currentBoard.length; i++) {
			for (int j = 0; j < currentBoard[i].length; j++) {
				if (currentBoard[i][j].equals("_")) {
					currentBoard[i][j] = symbol;
					AIMoves.add(new Move(i, j));
					System.out.println("AI placed move at " + i + "," + j);
					return currentBoard;
				}
			}
		}

		return currentBoard;
	}

	@Override
	public boolean checkIfWin(String[][] currentBoard, String symbol) {

		// Winning or losing will happen after player made the last move
		Move lastMove = AIMoves.get(AIMoves.size() - 1);
		int columnCounter = 0;
		int rowCounter = 0;
		int leftDiagonalCounter = 0;
		int rightDiagonalCounter = 0;
		for (int i = 0; i < currentBoard.length; i++) {

			if (currentBoard[lastMove.getRow()][i].equals(symbol)) {
				columnCounter++;
			}
			if (currentBoard[i][lastMove.getColumn()].equals(symbol)) {
				rowCounter++;
			}
			if (currentBoard[i][i].equals(symbol)) {
				leftDiagonalCounter++;
			}
			if (currentBoard[i][currentBoard.length - 1 - i].equals(symbol)) {
				rightDiagonalCounter++;
			}

		}
		return columnCounter == currentBoard.length || rowCounter == currentBoard.length
				|| leftDiagonalCounter == currentBoard.length || rightDiagonalCounter == currentBoard.length;
	}

	@Override
	public List<Move> getMoveHistory() {
		return this.AIMoves;
	}
}
