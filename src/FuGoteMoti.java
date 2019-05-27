import java.awt.Color;

import javax.swing.JLabel;

public class FuGoteMoti implements Shogi{


	void paintMasu() {
		for(int j = 0;j < 9;j++) {
			for(int i = 0;i < 9;i++) {
				if(Data.komaLabel[i][j].getIcon() == Data.fuImageC) {
					for(int m = 0;m < 9;m++) {
						Data.komaLabel[m][j].setBackground(null);
						Data.komaLabel[m][j].setOpaque(false);

					}

					break;

				}else if(i == 0){

				}else if(Judge.judgeSenteOrGote(Data.komaLabel[i][j].getIcon()) == SENTE
						   || Judge.judgeSenteOrGote(Data.komaLabel[i][j].getIcon()) == GOTE){

				}else {
					Data.komaLabel[i][j].setOpaque(true);
					Data.komaLabel[i][j].setBackground(Color.red);
				}
			}
		}

	}


	void enteredMasu(Object source) {
		for(int i = 0;i < 18;i++) {
			if(Data.fuGoteMoti[i] == source) {
				if(Data.fuGoteMoti[i].getIcon() == Data.fuImageC) {
					Data.fuGoteMoti[i].setOpaque(true);
					Data.fuGoteMoti[i].setBackground(Color.white);
				}
			}
		}
	}

	void exitedMasu(Object source) {
		for(int i = 0;i < 18;i++) {
			if(Data.fuGoteMoti[i] == source) {
	        	if(Data.fuGoteMoti[i].getIcon() == Data.fuImageC) {
	    			Data.fuGoteMoti[i].setBackground(null);
	    			Data.fuGoteMoti[i].setOpaque(false);
	    		}
	    	}
		}
	}


	void getFu() {
		for(int i = 0;i < 18;i++) {
			if(Data.fuGoteMoti[i].getIcon() == null) {
				Data.fuGoteMoti[i].setIcon(Data.fuImageC);
				break;
			}
		}
	}

	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 18;i++) {
			if(way) {
				if(Data.fuGoteMoti[i].getIcon() == null) {
					Data.fuGoteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.fuImageC);
				}
			}else {
				if(firstNull == null) {
					if(Data.fuGoteMoti[i].getIcon() == null) {
						firstNull = Data.fuGoteMoti[i];
					}

				}else {
					if(Data.fuGoteMoti[i].getIcon() == Data.fuImageC) {
						way = true;
					}
				}
			}
		}
	}

}
