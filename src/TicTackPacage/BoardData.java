package TicTackPacage;

public class BoardData {
	// the buttons from 1 to 9 if the set of buttons is displayed as follows
	// [1][2][3]
	// [4][5][6]
	// [7][8][9]

	public BoardData() {
		super();
	}

	private char[] board = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	// private int[][] combinations = { { 1, 5, 9 }, { 3, 5, 7 }, { 1, 2, 3 },
	// { 4, 5, 6 }, { 7, 8, 9 }, { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };

	public char[] getBoard() {
		return this.board;
	}

	public void setBoard(char[] board) {
		this.board = board;
	}

	public char getField(int Field) {
		return this.board[Field];
	}

	public void setField(int Field, char Symbol) {
		this.board[Field] = Symbol;
	}

	public void resetBoard() {
		for (int i = 0; i < 9; i++) {
			this.board[i] = 0;
		}
	}

	public boolean trippleEquals(char first, char second, char third) {
		if (first != 0) {
			if ((first == second && second == third)) {
				return true;
			}
		}
		return false;
	}

	public boolean isComplete() {
		if (trippleEquals(board[0], board[1], board[2])) {
			return true;
		} else if (trippleEquals(board[3], board[4], board[5])) {
			return true;
		} else if (trippleEquals(board[6], board[7], board[8])) {
			return true;
		} else if (trippleEquals(board[0], board[4], board[8])) {
			return true;
		} else if (trippleEquals(board[0], board[3], board[6])) {
			return true;
		} else if (trippleEquals(board[1], board[4], board[7])) {
			return true;
		} else if (trippleEquals(board[2], board[5], board[8])) {
			return true;
		} else if (trippleEquals(board[2], board[4], board[6])) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		for (int i = 0; i < board.length; i++) {
			if (board[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
