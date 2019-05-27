import java.awt.Color;

import javax.swing.JLabel;

public class KakuSenteMoti {

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
			if(Data.kakuSenteMoti[i] == source) {
				if(Data.kakuSenteMoti[i].getIcon() == Data.kakuImage) {
					Data.kakuSenteMoti[i].setOpaque(true);
					Data.kakuSenteMoti[i].setBackground(Color.white);
				}
			}
		}
	}

	void exitedMasu(Object source) {
		for(int i = 0;i < 2;i++) {
			if(Data.kakuSenteMoti[i] == source) {
				if(Data.kakuSenteMoti[i].getIcon() == Data.kakuImage) {
					Data.kakuSenteMoti[i].setBackground(null);
					Data.kakuSenteMoti[i].setOpaque(false);
				}
			}
		}
	}


	void getKakuC() {
		for(int i = 0;i < 2;i++) {
			if(Data.kakuSenteMoti[i].getIcon() == null) {
				Data.kakuSenteMoti[i].setIcon(Data.kakuImage);
				break;
			}
		}
	}

	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 2;i++) {
			if(way) {
				if(Data.kakuSenteMoti[i].getIcon() == null) {
					Data.kakuSenteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.kakuImage);
				}
			}else {
				if(firstNull == null) {
					if(Data.kakuSenteMoti[i].getIcon() == null) {
						firstNull = Data.kakuSenteMoti[i];
					}

				}else {
					if(Data.kakuSenteMoti[i].getIcon() == Data.kakuImage) {
						way = true;
					}
				}
			}
		}
	}

}
