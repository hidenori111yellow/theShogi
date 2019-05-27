import java.awt.Color;

import javax.swing.JLabel;

public class FuSenteMoti {
	final int SENTE = 0;
	final int GOTE = 1;
	final int NASHI = 2;

	void paintMasu() {
		for(int j = 0;j < 9;j++) {
			for(int i = 0;i < 9;i++) {
				if(Data.komaLabel[i][j].getIcon() == Data.fuImage) {
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
			if(Data.fuSenteMoti[i] == source) {
				if(Data.fuSenteMoti[i].getIcon() == Data.fuImage) {
					Data.fuSenteMoti[i].setOpaque(true);
					Data.fuSenteMoti[i].setBackground(Color.white);
				}
			}
		}
	}


	void exitedMasu(Object source) {
		for(int i = 0;i < 18;i++) {
			if(Data.fuSenteMoti[i] == source) {
	        	if(Data.fuSenteMoti[i].getIcon() == Data.fuImage) {
	    			Data.fuSenteMoti[i].setBackground(null);
	    			Data.fuSenteMoti[i].setOpaque(false);
	    		}
	    	}
		}
	}


	void getFuC() {
		for(int i = 0;i < 18;i++) {
			if(Data.fuSenteMoti[i].getIcon() == null) {
				Data.fuSenteMoti[i].setIcon(Data.fuImage);
				break;
			}
		}
	}


	void rearrange() {
		boolean way = false;
		JLabel firstNull = null;

		for(int i = 0;i < 18;i++) {
			if(way) {
				if(Data.fuSenteMoti[i].getIcon() == null) {
					Data.fuSenteMoti[i-1].setIcon(null);
					firstNull.setIcon(Data.fuImage);
				}
			}else {
				if(firstNull == null) {
					if(Data.fuSenteMoti[i].getIcon() == null) {
						firstNull = Data.fuSenteMoti[i];
					}

				}else {
					if(Data.fuSenteMoti[i].getIcon() == Data.fuImage) {
						way = true;
					}
				}
			}
		}
	}

}
