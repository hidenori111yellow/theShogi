import java.awt.Color;

import javax.swing.JLabel;

public class HishaGoteMoti {

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
		for(int i = 0;i < 2;i++) {
			if(Data.hishaGoteMoti[i] == source) {
				if(Data.hishaGoteMoti[i].getIcon() == Data.hishaImageC) {
					Data.hishaGoteMoti[i].setOpaque(true);
					Data.hishaGoteMoti[i].setBackground(Color.white);
				}
			}
		}
	}

	void exitedMasu(Object source) {
		for(int i = 0;i < 2;i++) {
			if(Data.hishaGoteMoti[i] == source) {
				if(Data.hishaGoteMoti[i].getIcon() == Data.hishaImageC) {
					Data.hishaGoteMoti[i].setBackground(null);
					Data.hishaGoteMoti[i].setOpaque(false);
				}
			}
		}
	}

	void getHisha() {
		for(int i = 0;i < 2;i++) {
			if(Data.hishaGoteMoti[i].getIcon() == null) {
				Data.hishaGoteMoti[i].setIcon(Data.hishaImageC);
				break;
			}
		}
	}

	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 2;i++) {
			if(way) {
				if(Data.hishaGoteMoti[i].getIcon() == null) {
					Data.hishaGoteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.hishaImageC);
				}
			}else {
				if(firstNull == null) {
					if(Data.hishaGoteMoti[i].getIcon() == null) {
						firstNull = Data.hishaGoteMoti[i];
					}

				}else {
					if(Data.hishaGoteMoti[i].getIcon() == Data.hishaImageC) {
						way = true;
					}
				}
			}
		}
	}

}
