import java.awt.Color;

import javax.swing.JLabel;

public class KakuGoteMoti {


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
			if(Data.kakuGoteMoti[i] == source) {
				if(Data.kakuGoteMoti[i].getIcon() == Data.kakuImageC) {
					Data.kakuGoteMoti[i].setOpaque(true);
					Data.kakuGoteMoti[i].setBackground(Color.white);
				}
			}
		}
	}

	void exitedMasu(Object source) {
		for(int i = 0;i < 2;i++) {
			if(Data.kakuGoteMoti[i] == source) {
				if(Data.kakuGoteMoti[i].getIcon() == Data.kakuImageC) {
					Data.kakuGoteMoti[i].setBackground(null);
					Data.kakuGoteMoti[i].setOpaque(false);
				}
			}
		}
	}


	void getKaku() {
		for(int i = 0;i < 2;i++) {
			if(Data.kakuGoteMoti[i].getIcon() == null) {
				Data.kakuGoteMoti[i].setIcon(Data.kakuImageC);
				break;
			}
		}
	}

	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 2;i++) {
			if(way) {
				if(Data.kakuGoteMoti[i].getIcon() == null) {
					Data.kakuGoteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.kakuImageC);
				}
			}else {
				if(firstNull == null) {
					if(Data.kakuGoteMoti[i].getIcon() == null) {
						firstNull = Data.kakuGoteMoti[i];
					}

				}else {
					if(Data.kakuGoteMoti[i].getIcon() == Data.kakuImageC) {
						way = true;
					}
				}
			}
		}
	}

}
