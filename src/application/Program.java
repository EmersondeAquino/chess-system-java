package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import Chess.ChessException;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner emerson = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
		try {	
			UI.clearScreen();	
			UI.printeBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(emerson);
			
			boolean[][] possibleMoves = chessMatch.possibleMoves(source);
			UI.clearScreen();
			UI.printeBoard(chessMatch.getPieces(), possibleMoves);
			System.out.println();
			System.out.print("Target:  ");
			ChessPosition target = UI.readChessPosition(emerson);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		  }
		  catch (ChessException e) {
			  System.out.println(e.getMessage());
			  emerson.nextLine();
		  }
		 catch (InputMismatchException e) {
			  System.out.println(e.getMessage());
			  emerson.nextLine();
		  }
		}
	}
}
