import java.awt.Color;

import javax.swing.JLabel;

public class KyouGoteMoti {


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
			if(Data.kyouGoteMoti[i] == source) {
				if(Data.kyouGoteMoti[i].getIcon() == Data.kyouImageC) {
					Data.kyouGoteMoti[i].setOpaque(true);
					Data.kyouGoteMoti[i].setBackground(Color.white);
				}
			}
		}
	}

	void exitedMasu(Object source) {
		for(int i = 0;i < 4;i++) {
			if(Data.kyouGoteMoti[i] == source) {
				if(Data.kyouGoteMoti[i].getIcon() == Data.kyouImageC) {
					Data.kyouGoteMoti[i].setBackground(null);
					Data.kyouGoteMoti[i].setOpaque(false);
				}
			}
		}
	}


	void getKyou() {
		for(int i = 0;i < 4;i++) {
			if(Data.kyouGoteMoti[i].getIcon() == null) {
				Data.kyouGoteMoti[i].setIcon(Data.kyouImageC);
				break;
			}
		}
	}

	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 4;i++) {
			if(way) {
				if(Data.kyouGoteMoti[i].getIcon() == null) {
					Data.kyouGoteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.kyouImageC);
				}
			}else {
				if(firstNull == null) {
					if(Data.kyouGoteMoti[i].getIcon() == null) {
						firstNull = Data.kyouGoteMoti[i];
					}

				}else {
					if(Data.kyouGoteMoti[i].getIcon() == Data.kyouImageC) {
						way = true;
					}
				}
			}
		}
	}

}
