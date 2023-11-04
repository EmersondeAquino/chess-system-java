package application;

import java.util.Scanner;

import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner emerson = new Scanner(System.in);
		ChessMatch chassMatch = new ChessMatch();
		
		while (true) {
		UI.printeBoard(chassMatch.getPieces());
		System.out.println();
		System.out.print("Source: ");
		ChessPosition source = UI.readChessPosition(emerson);
		
		System.out.println();
		System.out.print("Target:  ");
		ChessPosition target = UI.readChessPosition(emerson);
		
		ChessPiece capturedPiece = chassMatch.performChessMove(source, target);
		}
	}

}
