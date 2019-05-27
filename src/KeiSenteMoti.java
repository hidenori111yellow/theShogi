import java.awt.Color;

import javax.swing.JLabel;

public class KeiSenteMoti {

	final int SENTE = 0;
	final int GOTE = 1;
	final int NASHI = 2;

	void paintMasu() {
		for(int i = 0;i < 9;i++) {
			for(int j = 0;j < 9;j++) {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i][j].getIcon()) == SENTE
				   || Judge.judgeSenteOrGote(Data.komaLabel[i][j].getIcon()) == GOTE){

				}else if(i < 2) {

				}else {
					Data.komaLabel[i][j].setOpaque(true);
					Data.komaLabel[i][j].setBackground(Color.red);
				}
			}
		}

	}

	void enteredMasu(Object source) {
		for(int i = 0;i < 4;i++) {
			if(Data.keiSenteMoti[i] == source) {
				if(Data.keiSenteMoti[i].getIcon() == Data.keiImage) {
					Data.keiSenteMoti[i].setOpaque(true);
					Data.keiSenteMoti[i].setBackground(Color.white);
				}
			}
		}
	}

	void exitedMasu(Object source) {
		for(int i = 0;i < 4;i++) {
			if(Data.keiSenteMoti[i] == source) {
				if(Data.keiSenteMoti[i].getIcon() == Data.keiImage) {
					Data.keiSenteMoti[i].setBackground(null);
					Data.keiSenteMoti[i].setOpaque(false);
				}
			}
		}
	}

	void getKeiC() {
		for(int i = 0;i < 4;i++) {
			if(Data.keiSenteMoti[i].getIcon() == null) {
				Data.keiSenteMoti[i].setIcon(Data.keiImage);
				break;
			}
		}
	}

	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 4;i++) {
			if(way) {
				if(Data.keiSenteMoti[i].getIcon() == null) {
					Data.keiSenteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.keiImage);
				}
			}else {
				if(firstNull == null) {
					if(Data.keiSenteMoti[i].getIcon() == null) {
						firstNull = Data.keiSenteMoti[i];
					}

				}else {
					if(Data.keiSenteMoti[i].getIcon() == Data.keiImage) {
						way = true;
					}
				}
			}
		}
	}
}
