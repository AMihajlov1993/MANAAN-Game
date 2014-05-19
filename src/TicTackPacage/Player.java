package TicTackPacage;
public class Player {

	public enum TicToeEnum {
		X, O
	}

	private String Name;
	private int Score = 0;
	private TicToeEnum symbol;

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
}
