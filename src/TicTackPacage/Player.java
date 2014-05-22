package TicTackPacage;

public class Player {

	/*public enum TicToeEnum {
		X, O
	}*/

	private String Name;
	private int Score = 0;
	private char symbol;
	//private int row = -1;
	//private int col = -1;


	public char getSymbol() {
		return symbol;
	}

	public Player(char symbol) {
		super();
		if (symbol=='X'){
			Name = "Player 1";
		}else{
			Name = "Player 2";
		}
		Score = 0;
		this.symbol = symbol;
	}

	public void setSymbol(char symbol) {
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
		this.Score += 1;
	}

	public void NullPoint() {
		this.Score = 0;
	}

	/*public void SetPosition(int row, int col) {
		this.row = row;
		this.col = col;
	}*/
}
