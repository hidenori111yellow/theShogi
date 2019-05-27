import java.awt.Color;

import javax.swing.JLabel;

public class Koma {

	/*現在、このクラスは盤上のマスについての操作を行う*/

	void cleanMasuColor() {
		for(int n = 0;n < 9;n++) {
			for(int k = 0;k < 9;k++) {

				Data.komaLabel[n][k].setBackground(null);
			    Data.komaLabel[n][k].setOpaque(false);

			}
		}
	}


	void enteredMasu(JLabel source) {
		loop: for(int i = 0;i < 9;i++) {
    		for(int j = 0;j < 9;j++) {
    			if(Data.komaLabel[i][j] == source){
    				if(Data.komaLabel[i][j].getBackground() == Color.red) {

    				}else if(Data.komaLabel[i][j].getBackground() == Color.GREEN){
    				}else {
    					Data.komaLabel[i][j].setOpaque(true);
        				Data.komaLabel[i][j].setBackground(Color.white);
    				}
    					break loop;
    			}
    		}
    	}
	}

	void exitedMasu(JLabel source) {
		loop: for(int i = 0;i < 9;i++) {
    		for(int j = 0;j < 9;j++) {
    			if(Data.komaLabel[i][j] == source) {
    				if(Data.komaLabel[i][j].getBackground() == Color.white) {
    					Data.komaLabel[i][j].setBackground(null);
        				Data.komaLabel[i][j].setOpaque(false);
    				}
    					break loop;
    			}
    		}
    	}
	}



}
