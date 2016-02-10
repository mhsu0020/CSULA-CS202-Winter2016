import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HumanPlayer implements PlayTicTacToe {

	List<Move> playerMoves;

	public HumanPlayer() {
		playerMoves = new ArrayList<>();
	}

	@Override
	public String[][] takeTurn(String[][] currentBoard, String symbol) {

		boolean playerMadeValidMove = false;
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				GameUtils.prettyPrintGameBoard(currentBoard);
				System.out.println("Your symbol: " + symbol);
				System.out.println("Enter row column in the format ROW,COLUMN");
				String input = scanner.nextLine();
				String[] inputTokens = input.split(",");
				int row = Integer.parseInt(inputTokens[0]);
				int column = Integer.parseInt(inputTokens[1]);
				if (row > currentBoard.length || column > currentBoard[0].length) {
					System.out.println("out of range");
					continue;
				}
				// check if there's already a move there
				if (!currentBoard[row][column].equals("_")) {
					System.out.println("Space is occupied.");
					continue;
				} else {
					// Place symbol in player chosen spot
					currentBoard[row][column] = symbol;
					this.playerMoves.add(new Move(row, column));
					return currentBoard;
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid Input");
				continue;
			}

		} while (!playerMadeValidMove);


		return currentBoard;
	}

	@Override
	public boolean checkIfWin(String[][] currentBoard, String symbol) {

		// Winning or losing will happen after player made the last move
		Move lastMove = playerMoves.get(playerMoves.size() - 1);
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
			if (currentBoard[i][currentBoard.length-1 - i].equals(symbol)) {
				rightDiagonalCounter++;
			}

		}
		return columnCounter == currentBoard.length || rowCounter == currentBoard.length
				|| leftDiagonalCounter == currentBoard.length || rightDiagonalCounter == currentBoard.length;
	}

	@Override
	public List<Move> getMoveHistory() {
		return this.playerMoves;
	}

}
