import java.awt.Color;

import javax.swing.JLabel;

public class KinSenteMoti {

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
			if(Data.kinSenteMoti[i] == source) {
				if(Data.kinSenteMoti[i].getIcon() == Data.kinImage) {
					Data.kinSenteMoti[i].setOpaque(true);
					Data.kinSenteMoti[i].setBackground(Color.white);
				}
			}
		}
	}

	void exitedMasu(Object source) {
		for(int i = 0;i < 4;i++) {
			if(Data.kinSenteMoti[i] == source) {
				if(Data.kinSenteMoti[i].getIcon() == Data.kinImage) {
					Data.kinSenteMoti[i].setBackground(null);
					Data.kinSenteMoti[i].setOpaque(false);
				}
			}
		}
	}

	void getKinC() {
		for(int i = 0;i < 4;i++) {
			if(Data.kinSenteMoti[i].getIcon() == null) {
				Data.kinSenteMoti[i].setIcon(Data.kinImage);
				break;
			}
		}
	}

	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 4;i++) {
			if(way) {
				if(Data.kinSenteMoti[i].getIcon() == null) {
					Data.kinSenteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.kinImage);
				}
			}else {
				if(firstNull == null) {
					if(Data.kinSenteMoti[i].getIcon() == null) {
						firstNull = Data.kinSenteMoti[i];
					}

				}else {
					if(Data.kinSenteMoti[i].getIcon() == Data.kinImage) {
						way = true;
					}
				}
			}
		}
	}

}
