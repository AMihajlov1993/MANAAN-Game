package TicTackPacage;

public class Player {

	public enum TicToeEnum {
		X, O
	}

	private String Name;
	private int Score = 0;
	private TicToeEnum symbol;
	private int row = -1;
	private int col = -1;

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public TicToeEnum getSymbol() {
		return symbol;
	}

	public void setSymbol(TicToeEnum symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getScore() {
		return Score;
	}

	public void setScore() {
		this.Score = +1;
	}

	public void NullPoint() {
		this.Score = 0;
	}

	public void SetPosition(int row, int col) {
		this.row = row;
		this.col = col;
	}
}
