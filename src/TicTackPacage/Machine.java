package TicTackPacage;

import TicTackPacage.Player.TicToeEnum;

//Draft class
public class Machine {
	private static void Game() {
		Player myPlayer = new Player();
		Player bot = new Player();
		Player currentPlayer;
		BoardData theBoard = new BoardData();
		int myPlayerTurn = 0;
		boolean isPlaying = true;
		boolean isWinner = false;
		while (isPlaying) {
			if (myPlayerTurn % 2 == 0) {
				myPlayer.setSymbol(TicToeEnum.X);
				currentPlayer = myPlayer;

			} else {
				bot.setSymbol(TicToeEnum.O);
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
