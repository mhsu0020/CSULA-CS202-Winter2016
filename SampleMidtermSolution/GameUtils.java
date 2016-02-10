import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//Static utility methods
public class GameUtils {

	// Should be called after checkIfWin
	public static boolean checkIfSpotAvailable(String[][] gameBoard) {

		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard.length; j++) {
				if (gameBoard[i][j].equals("_")) {
					return true;
				}
			}
		}
		return false;

	}

	// Prints out gameboard with spaces
	public static void prettyPrintGameBoard(String[][] gameBoard) {
		// Column Numbers
		System.out.print(String.format("%10s", " "));
		System.out.print(String.format("%10s", 0));
		System.out.print(String.format("%10s", 1));
		System.out.print(String.format("%10s", 2));
		System.out.println();
		for (int i = 0; i < gameBoard.length; i++) {
			// Row Numbers
			System.out.print(String.format("%10s", i));
			for (int j = 0; j < gameBoard[i].length; j++) {
				System.out.print(String.format("%10s", gameBoard[i][j]));
			}
			System.out.println("");
		}

	}

	public static void doGameFinishActions(String[][] finalBoard, List<Move> playerOneMoves, String playerOneSymbol,
			List<Move> playerTwoMoves, String playerTwoSymbol) {
		System.out.println("Final Board: ");
		GameUtils.prettyPrintGameBoard(finalBoard);
		GameUtils.writeMovesToFile(finalBoard, playerOneMoves, "X", playerTwoMoves, "O");
		System.exit(0);

	}

	public static void writeMovesToFile(String[][] finalBoard, List<Move> playerOneMoves, String playerOneSymbol,
			List<Move> playerTwoMoves, String playerTwoSymbol) {

		// Change to your own path
		Path path = Paths.get("C:\\Users\\Michael\\Desktop\\TicTacToeGame" + System.currentTimeMillis() + ".txt");

		Charset charset = Charset.forName("US-ASCII");
		// This opens or creates an existing file
		try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
			writer.write("Tic Tac Toe");
			writer.newLine();
			writer.write("Player One symbol: " + playerOneSymbol);
			writer.newLine();
			writer.write("Player Two symbol: " + playerTwoSymbol);
			writer.newLine();

			writer.write("Final Board: ");
			writer.newLine();

			// Column Numbers
			writer.write(String.format("%10s", " "));
			writer.write(String.format("%10s", 0));
			writer.write(String.format("%10s", 1));
			writer.write(String.format("%10s", 2));
			writer.newLine();
			for (int i = 0; i < finalBoard.length; i++) {
				// Row Numbers
				writer.write(String.format("%10s", i));
				for (int j = 0; j < finalBoard[i].length; j++) {
					writer.write(String.format("%10s", finalBoard[i][j]));
				}
				writer.newLine();
			}
			writer.newLine();

			while (playerOneMoves.size() > 0 || playerTwoMoves.size() > 0) {
				Move playerOne = playerOneMoves.remove(0);
				writer.write("player One: " + playerOne.getRow() + "," + playerOne.getColumn());
				writer.newLine();
				if (playerTwoMoves.size() > 0) {
					Move playerTwo = playerTwoMoves.remove(0);
					writer.write("player Two: " + playerTwo.getRow() + "," + playerTwo.getColumn());
					writer.newLine();
				}
			}

		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}

	}

}
