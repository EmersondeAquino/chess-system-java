package Chess;

import boardgame.BoardException;

public class ChessException extends BoardException{
 static final long serialVersionUID = 1L;
 
   public ChessException(String msg) {
	   super(msg);
   }
}
