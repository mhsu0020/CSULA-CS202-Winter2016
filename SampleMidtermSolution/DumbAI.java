import java.util.ArrayList;
import java.util.List;

public class DumbAI implements PlayTicTacToe {

	List<Move> AIMoves;

	public DumbAI() {
		AIMoves = new ArrayList<>();
	}

	@Override
	public String[][] takeTurn(String[][] currentBoard, String symbol) {

		//Dumb AI: place move at first available spot

		for (int i = 0; i < currentBoard.length; i++) {
			for (int j = 0; j < currentBoard[i].length; j++) {
				if(currentBoard[i][j].equals("_")){
					currentBoard[i][j]=symbol;
					AIMoves.add(new Move(i, j));
					System.out.println("AI placed move at "+i+","+j);
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
			if (currentBoard[i][currentBoard.length-1 - i].equals(symbol)) {
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
