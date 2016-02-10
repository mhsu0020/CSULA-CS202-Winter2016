import java.util.List;

public interface PlayTicTacToe {

   //Places the symbol in an 'empty' element and return the modified array.

   String[][] takeTurn(String[][] currentBoard, String symbol);

   //Checks if the player wins the game given the symbol and the game

   boolean checkIfWin(String[][] currentBoard, String symbol);

   List<Move> getMoveHistory();

}