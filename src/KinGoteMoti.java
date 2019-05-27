import java.awt.Color;

import javax.swing.JLabel;

public class KinGoteMoti {


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
			if(Data.kinGoteMoti[i] == source) {
				if(Data.kinGoteMoti[i].getIcon() == Data.kinImageC) {
					Data.kinGoteMoti[i].setOpaque(true);
					Data.kinGoteMoti[i].setBackground(Color.white);
				}
			}

		}
	}

	void exitedMasu(Object source) {
		for(int i = 0;i < 4;i++) {
			if(Data.kinGoteMoti[i] == source) {
				if(Data.kinGoteMoti[i].getIcon() == Data.kinImageC) {
					Data.kinGoteMoti[i].setBackground(null);
					Data.kinGoteMoti[i].setOpaque(false);
				}
			}
		}
	}


	void getKin() {
		for(int i = 0;i < 4;i++) {
			if(Data.kinGoteMoti[i].getIcon() == null) {
				Data.kinGoteMoti[i].setIcon(Data.kinImageC);
				break;
			}
		}
	}

	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 4;i++) {
			if(way) {
				if(Data.kinGoteMoti[i].getIcon() == null) {
					Data.kinGoteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.kinImageC);
				}
			}else {
				if(firstNull == null) {
					if(Data.kinGoteMoti[i].getIcon() == null) {
						firstNull = Data.kinGoteMoti[i];
					}

				}else {
					if(Data.kinGoteMoti[i].getIcon() == Data.kinImageC) {
						way = true;
					}
				}
			}
		}
	}

}
