package application;

import Chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chaessMatch = new ChessMatch();
		UI.printeBoard(chaessMatch.getPieces());
	}

}
