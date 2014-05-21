package TicTackPacage;

import TicTackPacage.Player.TicToeEnum;

//Draft class
public class Machine {
	private static void Game() {
		Player myPlayer = new Player();
		myPlayer.setSymbol(TicToeEnum.X);
		Player bot = new Player();
		bot.setSymbol(TicToeEnum.O);
		Player currentPlayer;
		BoardData theBoard = new BoardData();
		int myPlayerTurn = 0;
		boolean isPlaying = true;
		boolean isWinner = false;
		while (isPlaying) {
			if (myPlayerTurn % 2 == 0) {
				currentPlayer = myPlayer;
				//TODO get the pressed button
				//TODO setField[Field, myPlayer.getSymbol]

			} else {
				currentPlayer = bot;
			}
			myPlayerTurn++;

			if (isWinner) {
				isPlaying = false;
			}

			if (myPlayerTurn == 8) {
				isPlaying = false;
			}
		}

	}

}
