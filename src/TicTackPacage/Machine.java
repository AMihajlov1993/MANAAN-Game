package TicTackPacage;


//Draft class
public class Machine {
	Player Player1 = new Player('X');
	Player Player2 = new Player('O');
	int currentPlayerCounter = 0;
	Player currentPlayer;
	int winner = 0;
	BoardData Board = new BoardData();
	public Machine() {
		super();
		this.GameStart();
	}
	public int getCurrentPlayerCounter() {
		return currentPlayerCounter;
	}
	public void setCurrentPlayerCounter(int currentPlayerCounter) {
		this.currentPlayerCounter = currentPlayerCounter;
	}
	public int getWinner() {
		return winner;
	}
	public void setWinner(int winner) {
		this.winner = winner;
	}
	public void GameStart(){
		this.setCurrentPlayerCounter(1);
		currentPlayer=Player1;
		this.setWinner(0);
		this.Board.resetBoard();
	}
	public void SwitchPlayer(){
		if(this.getCurrentPlayerCounter()==1){
			currentPlayer=Player2;
			this.setCurrentPlayerCounter(2);
		} else if(this.getCurrentPlayerCounter()==2){
			currentPlayer=Player1;
			this.setCurrentPlayerCounter(1);
		}
	}
	public void Mark(int Field){
		if(Board.getField(Field)==0){
			Board.setField(Field, currentPlayer.getSymbol());
		if((!Board.isComplete())&&(!Board.isFull()))
				this.SwitchPlayer();
		}
		if(Board.isComplete()){
			this.setWinner(getCurrentPlayerCounter());
			currentPlayer.setScore();
			Board.resetBoard();
			this.GameStart();
		}
		if(Board.isFull()){
			this.setWinner(0);
			Board.resetBoard();
			this.GameStart();
		}
	}
	public void ResetGame(){
		Player1.NullPoint();
		Player2.NullPoint();
		Board.resetBoard();
		this.GameStart();
	}
		
	
}
