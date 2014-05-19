
public class Player {

	private String Name;
	private int Score = 0;

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
