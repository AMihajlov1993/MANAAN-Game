package TicTackPacage;
//Draft class
public class Machine {
	private static void Game() {
		Player myPlayer = new Player();
		Player bot = new Player();
		Player currentPlayer;
		int myPlayerTurn = 0;
		boolean isPlaying = true;
		
		while(isPlaying) {
			if(myPlayerTurn % 2 == 0) {
				currentPlayer = myPlayer;
			
			}else {
				currentPlayer = bot;
			}
			myPlayerTurn++;
			
		}
		
	}
	
}
