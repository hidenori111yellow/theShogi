import java.awt.Color;

public class HishaC implements Shogi{


	void paintMasu(int i,int j) {
		int count = 0;
		//後ろ直線のマスに色をつける
		for(int n = 1;n < 9;n++) {
			try {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i-n][j].getIcon()) == GOTE) {
					if(count == n) {
						count = 0;
					}
					break;
				}else if(Judge.judgeSenteOrGote(Data.komaLabel[i-n][j].getIcon()) == SENTE){
					if(count == n) {
						count = 0;
						break;
					}
					count = n + 1;
					Data.komaLabel[i-n][j].setOpaque(true);
					Data.komaLabel[i-n][j].setBackground(Color.red);
				}else {
					if(count == n) {
						count = 0;
						break;
					}

					Data.komaLabel[i-n][j].setOpaque(true);
					Data.komaLabel[i-n][j].setBackground(Color.red);
				}
			}catch(ArrayIndexOutOfBoundsException m) {count = 0;}
		}

		//前直線のマスに色をつける
		for(int n = 1;n < 9;n++) {
			try {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i+n][j].getIcon()) == GOTE) {
					if(count == n) {
						count = 0;
					}
					break;
				}else if(Judge.judgeSenteOrGote(Data.komaLabel[i+n][j].getIcon()) == SENTE){
					if(count == n) {
						count = 0;
						break;
					}
					count = n + 1;
					Data.komaLabel[i+n][j].setOpaque(true);
					Data.komaLabel[i+n][j].setBackground(Color.red);
				}else {
					if(count == n) {
						count = 0;
						break;
					}
					Data.komaLabel[i+n][j].setOpaque(true);
					Data.komaLabel[i+n][j].setBackground(Color.red);
				}
		    }catch(ArrayIndexOutOfBoundsException m) {count = 0;}
		}

		//左直線のマスに色をつける
		for(int n = 1;n < 9;n++) {
			try {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i][j-n].getIcon()) == GOTE) {
					if(count == n) {
						count = 0;
					}
					break;
				}else if(Judge.judgeSenteOrGote(Data.komaLabel[i][j-n].getIcon()) == SENTE){
					if(count == n) {
						count = 0;
						break;
					}
					count = n + 1;
					Data.komaLabel[i][j-n].setOpaque(true);
					Data.komaLabel[i][j-n].setBackground(Color.red);
				}else {
					if(count == n) {
						count = 0;
						break;
					}
					Data.komaLabel[i][j-n].setOpaque(true);
					Data.komaLabel[i][j-n].setBackground(Color.red);
				}
		    }catch(ArrayIndexOutOfBoundsException m) {count = 0;}
		}

		//右直線のマスに色をつける
		for(int n = 1;n < 9;n++) {
			try {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i][j+n].getIcon()) == GOTE) {
					if(count == n) {
						count = 0;
					}
				    break;
				}else if(Judge.judgeSenteOrGote(Data.komaLabel[i][j+n].getIcon()) == SENTE){
					if(count == n) {
						count = 0;
						break;
					}
					count = n + 1;
					Data.komaLabel[i][j+n].setOpaque(true);
					Data.komaLabel[i][j+n].setBackground(Color.red);
				}else {
					if(count == n) {
						count = 0;
						break;
					}
					Data.komaLabel[i][j+n].setOpaque(true);
				    Data.komaLabel[i][j+n].setBackground(Color.red);
				}
		    }catch(ArrayIndexOutOfBoundsException m) {count = 0;}
		}

	}

}
