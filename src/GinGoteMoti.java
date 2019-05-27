import java.awt.Color;

import javax.swing.JLabel;

public class GinGoteMoti {

	final int SENTE = 0;
	final int GOTE = 1;
	final int NASHI = 2;

	void paintMasu() {
		for(int i = 0;i < 9;i++) {
			for(int j = 0;j < 9;j++) {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i][j].getIcon()) == SENTE
				   || Judge.judgeSenteOrGote(Data.komaLabel[i][j].getIcon()) == GOTE){

				}else {
					Data.komaLabel[i][j].setOpaque(true);
					Data.komaLabel[i][j].setBackground(Color.red);
				}
			}
		}

	}

	void enteredMasu(Object source) {
		for(int i = 0;i < 4;i++) {
			if(Data.ginGoteMoti[i] == source) {
				if(Data.ginGoteMoti[i].getIcon() == Data.ginImageC) {
					Data.ginGoteMoti[i].setOpaque(true);
					Data.ginGoteMoti[i].setBackground(Color.white);
				}
			}
		}
	}

	void exitedMasu(Object source) {
		for(int i = 0;i < 4;i++) {
			if(Data.ginGoteMoti[i] == source) {
				if(Data.ginGoteMoti[i].getIcon() == Data.ginImageC) {
					Data.ginGoteMoti[i].setBackground(null);
					Data.ginGoteMoti[i].setOpaque(false);
				}
			}
		}
	}


	void getGin() {
		for(int i = 0;i < 4;i++) {
			if(Data.ginGoteMoti[i].getIcon() == null) {
				Data.ginGoteMoti[i].setIcon(Data.ginImageC);
				break;
			}
		}
	}


	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 4;i++) {
			if(way) {
				if(Data.ginGoteMoti[i].getIcon() == null) {
					Data.ginGoteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.ginImageC);
				}
			}else {
				if(firstNull == null) {
					if(Data.ginGoteMoti[i].getIcon() == null) {
						firstNull = Data.ginGoteMoti[i];
					}

				}else {
					if(Data.ginGoteMoti[i].getIcon() == Data.ginImageC) {
						way = true;
					}
				}
			}
		}
	}

}
