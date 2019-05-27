import java.awt.Color;

import javax.swing.JLabel;

public class GinSenteMoti implements Shogi{

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
			if(Data.ginSenteMoti[i] == source) {
				if(Data.ginSenteMoti[i].getIcon() == Data.ginImage) {
					Data.ginSenteMoti[i].setOpaque(true);
					Data.ginSenteMoti[i].setBackground(Color.white);
				}
			}
		}
	}

	void exitedMasu(Object source) {
		for(int i = 0;i < 4;i++) {
			if(Data.ginSenteMoti[i] == source) {
				if(Data.ginSenteMoti[i].getIcon() == Data.ginImage) {
					Data.ginSenteMoti[i].setBackground(null);
					Data.ginSenteMoti[i].setOpaque(false);
				}
			}
		}
	}

	void getGinC() {
		for(int i = 0;i < 4;i++) {
			if(Data.ginSenteMoti[i].getIcon() == null) {
				Data.ginSenteMoti[i].setIcon(Data.ginImage);
				break;
			}
		}
	}

	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 4;i++) {
			if(way) {
				if(Data.ginSenteMoti[i].getIcon() == null) {
					Data.ginSenteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.ginImage);
				}
			}else {
				if(firstNull == null) {
					if(Data.ginSenteMoti[i].getIcon() == null) {
						firstNull = Data.ginSenteMoti[i];
					}

				}else {
					if(Data.ginSenteMoti[i].getIcon() == Data.ginImage) {
						way = true;
					}
				}
			}
		}
	}

}
