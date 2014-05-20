package TicTackPacage;

public class BoardData {
	//the buttons from 1 to 9 if the set of buttons is displayed as follows
	//[1][2][3]
	//[4][5][6]
	//[7][8][9]
	
	public BoardData() {
		super();
	}

	private char [] board={0,0,0,0,0,0,0,0,0};
	
	private int[][] combinations = {
			{1,5,9},
			{3,5,7},
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{1,4,7},
			{2,5,8},
			{3,6,9}
	};
	
	public char getField(int Field){
		return this.board[Field];
	}
	public void setField(int Field, char Symbol){
		this.board[Field]=Symbol;
	}
	public void resetBoard(){
		for(int i=0;i<9;i++){
			this.board[i]=0;
		}
	}
	public boolean isComplete(){
		
	}
}
