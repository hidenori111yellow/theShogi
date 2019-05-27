import java.awt.Color;

import javax.swing.JLabel;

public class KyouSenteMoti {

	final int SENTE = 0;
	final int GOTE = 1;
	final int NASHI = 2;

	void paintMasu() {
		for(int i = 0;i < 9;i++) {
			for(int j = 0;j < 9;j++) {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i][j].getIcon()) == SENTE
				   || Judge.judgeSenteOrGote(Data.komaLabel[i][j].getIcon()) == GOTE){

				}else if(i == 0){

				}else {
					Data.komaLabel[i][j].setOpaque(true);
					Data.komaLabel[i][j].setBackground(Color.red);
				}
			}
		}

	}

	void enteredMasu(Object source) {
		for(int i = 0;i < 4;i++) {
			if(Data.kyouSenteMoti[i] == source) {
				if(Data.kyouSenteMoti[i].getIcon() == Data.kyouImage) {
					Data.kyouSenteMoti[i].setOpaque(true);
					Data.kyouSenteMoti[i].setBackground(Color.white);
				}
			}
		}
	}

	void exitedMasu(Object source) {
		for(int i = 0;i < 4;i++) {
			if(Data.kyouSenteMoti[i] == source) {
				if(Data.kyouSenteMoti[i].getIcon() == Data.kyouImage) {
					Data.kyouSenteMoti[i].setBackground(null);
					Data.kyouSenteMoti[i].setOpaque(false);
				}
			}
		}
	}

	void getKyouC() {
		for(int i = 0;i < 4;i++) {
			if(Data.kyouSenteMoti[i].getIcon() == null) {
				Data.kyouSenteMoti[i].setIcon(Data.kyouImage);
				break;
			}
		}
	}

	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 4;i++) {
			if(way) {
				if(Data.kyouSenteMoti[i].getIcon() == null) {
					Data.kyouSenteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.kyouImage);
				}
			}else {
				if(firstNull == null) {
					if(Data.kyouSenteMoti[i].getIcon() == null) {
						firstNull = Data.kyouSenteMoti[i];
					}

				}else {
					if(Data.kyouSenteMoti[i].getIcon() == Data.kyouImage) {
						way = true;
					}
				}
			}
		}
	}

}
