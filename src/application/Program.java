/**
 * 
 */
package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

/**
 * @author jojo
 *
 */
	public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		

	}

}
