package boardgame;

public class Position {

	private int rows;
	private int columns;
	
	public Position(int row, int column) {
		this.rows = row;
		this.columns = column;
	}

	public int getRow() {
		return rows;
	}

	public void setRow(int row) {
		this.rows = row;
	}

	public int getColumn() {
		return columns;
	}

	public void setColumn(int column) {
		this.columns = column;
	}
	
	@Override
	public String toString() {
		return rows + ", " + columns;
	}
}
