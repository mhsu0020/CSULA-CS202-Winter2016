import java.util.Scanner;

public class GameRunner {

	public static void main(String[] args) {

		// current player
		PlayTicTacToe playerOne = new HumanPlayer();

		// Could be another human or one of the AIs
		PlayTicTacToe playerTwo = null;

		String[][] currentGameBoard = { { "_", "_", "_" }, { "_", "_", "_" }, { "_", "_", "_" } };
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Select from options below:\n1.Play with another human\n2.Play with dumb AI\n3.Play with another aggresive AI");
		int input = scanner.nextInt();
		scanner.nextLine();
		switch (input) {
		case 1:
			playerTwo = new HumanPlayer();
			break;
		case 2:
			playerTwo = new DumbAI();
			break;
		case 3:
			playerTwo = new DumbAI2();
			break;
		}

		while (true) {

			currentGameBoard = playerOne.takeTurn(currentGameBoard, "X");
			if (!playerOne.checkIfWin(currentGameBoard, "X")) {
				if (!GameUtils.checkIfSpotAvailable(currentGameBoard)) {
					System.out.println("Stalemate!!!!!!");
					GameUtils.doGameFinishActions(currentGameBoard, playerOne.getMoveHistory(), "X",
							playerTwo.getMoveHistory(), "O");
				}

				currentGameBoard = playerTwo.takeTurn(currentGameBoard, "O");
				if (!playerTwo.checkIfWin(currentGameBoard, "O")) {
					if (!GameUtils.checkIfSpotAvailable(currentGameBoard)) {
						System.out.println("Stalemate!!!!!!");
						GameUtils.doGameFinishActions(currentGameBoard, playerOne.getMoveHistory(), "X",
								playerTwo.getMoveHistory(), "O");
					}
					continue;
				} else {
					System.out.println("Player Two's victory!!!");
					GameUtils.doGameFinishActions(currentGameBoard, playerOne.getMoveHistory(), "X",
							playerTwo.getMoveHistory(), "O");
				}

			} else {
				System.out.println("Player One wins!!!!");
				GameUtils.doGameFinishActions(currentGameBoard, playerOne.getMoveHistory(), "X",
						playerTwo.getMoveHistory(), "O");
			}

		}

	}

}
