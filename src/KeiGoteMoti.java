import java.awt.Color;

import javax.swing.JLabel;

public class KeiGoteMoti {

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
			if(Data.keiGoteMoti[i] == source) {
				if(Data.keiGoteMoti[i].getIcon() == Data.keiImageC) {
					Data.keiGoteMoti[i].setOpaque(true);
					Data.keiGoteMoti[i].setBackground(Color.white);
				}
			}
		}
	}

	void exitedMasu(Object source) {
		for(int i = 0;i < 4;i++) {
			if(Data.keiGoteMoti[i] == source) {
				if(Data.keiGoteMoti[i].getIcon() == Data.keiImageC) {
					Data.keiGoteMoti[i].setBackground(null);
					Data.keiGoteMoti[i].setOpaque(false);
				}
			}
		}
	}


	void getKei() {
		for(int i = 0;i < 4;i++) {
			if(Data.keiGoteMoti[i].getIcon() == null) {
				Data.keiGoteMoti[i].setIcon(Data.keiImageC);
				break;
			}
		}
	}

	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 4;i++) {
			if(way) {
				if(Data.keiGoteMoti[i].getIcon() == null) {
					Data.keiGoteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.keiImageC);
				}
			}else {
				if(firstNull == null) {
					if(Data.keiGoteMoti[i].getIcon() == null) {
						firstNull = Data.keiGoteMoti[i];
					}

				}else {
					if(Data.keiGoteMoti[i].getIcon() == Data.keiImageC) {
						way = true;
					}
				}
			}
		}
	}



}
