import java.awt.Color;

import javax.swing.JLabel;

public class HishaSenteMoti {

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
			if(Data.hishaSenteMoti[i] == source) {
				if(Data.hishaSenteMoti[i].getIcon() == Data.hishaImage) {
					Data.hishaSenteMoti[i].setOpaque(true);
					Data.hishaSenteMoti[i].setBackground(Color.white);
				}
			}
		}
	}

	void exitedMasu(Object source) {
		for(int i = 0;i < 2;i++) {
			if(Data.hishaSenteMoti[i] == source) {
				if(Data.hishaSenteMoti[i].getIcon() == Data.hishaImage) {
					Data.hishaSenteMoti[i].setBackground(null);
					Data.hishaSenteMoti[i].setOpaque(false);
				}
			}
		}

	}

	void getHishaC() {
		for(int i = 0;i < 2;i++) {
			if(Data.hishaSenteMoti[i].getIcon() == null) {
				Data.hishaSenteMoti[i].setIcon(Data.hishaImage);
				break;
			}
		}
	}

	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 2;i++) {
			if(way) {
				if(Data.hishaSenteMoti[i].getIcon() == null) {
					Data.hishaSenteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.hishaImage);
				}
			}else {
				if(firstNull == null) {
					if(Data.hishaSenteMoti[i].getIcon() == null) {
						firstNull = Data.hishaSenteMoti[i];
					}

				}else {
					if(Data.hishaSenteMoti[i].getIcon() == Data.hishaImage) {
						way = true;
					}
				}
			}
		}
	}

}
