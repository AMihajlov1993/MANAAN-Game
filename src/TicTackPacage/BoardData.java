package TicTackPacage;

public class BoardData {
	//the buttons from 1 to 9 if the set of buttons is displayed as follows
	//[1][2][3]
	//[4][5][6]
	//[7][8][9]
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
	private boolean isAvailable;
	private int buttonNumber;
	public BoardData(boolean isAvailable,int buttonNumber) {
		this.isAvailable = isAvailable;
		this.buttonNumber = buttonNumber;
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}
	
	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public int getButtonNumber() {
		return buttonNumber;
	}
	
	public void setButtonNumber(int buttonNumber) {
		this.buttonNumber = buttonNumber;
	}
	
	public void makeUnavailable() {
		if(!isAvailable) {
			for(int raw = 0; raw < 8; raw++) {
				for(int col = 0; col < 8; col++) {
					if(combinations[raw][col] == buttonNumber) {
						this.combinations[raw][col] = -1 * buttonNumber;
					}
				}
			}
		}
		
	}
	
	public void checkAvailable() {
		for(int raw = 0; raw < 8; raw++) {
			for(int col = 0; col < 8; col++) {
				if(combinations[raw][col] > 0) {
					this.isAvailable = true;
				}else {
					this.isAvailable = false;
				}
			}
		}
		
	}

}
