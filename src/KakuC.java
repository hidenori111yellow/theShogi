import java.awt.Color;

public class KakuC {
	final int SENTE = 0;
	final int GOTE = 1;
	final int NASHI = 2;

	void paintMasu(int i,int j) {
		int count = 0;
		//左斜め後ろ直線のマスに色をつける
		for(int n = 1;n < 9;n++) {
			try {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i-n][j-n].getIcon()) == GOTE) {
					if(count == n) {
						count = 0;
					}
					break;
				}else if(Judge.judgeSenteOrGote(Data.komaLabel[i-n][j-n].getIcon()) == SENTE){
					if(count == n) {
						count = 0;
						break;
					}
					count = n + 1;
					Data.komaLabel[i-n][j-n].setOpaque(true);
					Data.komaLabel[i-n][j-n].setBackground(Color.red);
				}else {
					if(count == n) {
						count = 0;
						break;
					}
					Data.komaLabel[i-n][j-n].setOpaque(true);
					Data.komaLabel[i-n][j-n].setBackground(Color.red);
				}
			}catch(ArrayIndexOutOfBoundsException m) {count = 0;}
		}

		//右斜め後ろ直線のマスに色をつける
		for(int n = 1;n < 9;n++) {
			try {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i-n][j+n].getIcon()) == GOTE) {
					if(count == n) {
						count = 0;
					}
					break;
				}else if(Judge.judgeSenteOrGote(Data.komaLabel[i-n][j+n].getIcon()) == SENTE){
					if(count == n) {
						count = 0;
						break;
					}
					count = n + 1;
					Data.komaLabel[i-n][j+n].setOpaque(true);
					Data.komaLabel[i-n][j+n].setBackground(Color.red);
				}else {
					if(count == n) {
						count = 0;
						break;
					}
					Data.komaLabel[i-n][j+n].setOpaque(true);
					Data.komaLabel[i-n][j+n].setBackground(Color.red);
				}
			}catch(ArrayIndexOutOfBoundsException m) {count = 0;}
		}

		//左斜め前直線のマスに色をつける
		for(int n = 1;n < 9;n++) {
			try {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i+n][j-n].getIcon()) == GOTE) {
					if(count == n) {
						count = 0;
					}
					break;
				}else if(Judge.judgeSenteOrGote(Data.komaLabel[i+n][j-n].getIcon()) == SENTE){
					if(count == n) {
						count = 0;
						break;
					}
					count = n + 1;
					Data.komaLabel[i+n][j-n].setOpaque(true);
					Data.komaLabel[i+n][j-n].setBackground(Color.red);
				}else {
					if(count == n) {
						count = 0;
						break;
					}
					Data.komaLabel[i+n][j-n].setOpaque(true);
					Data.komaLabel[i+n][j-n].setBackground(Color.red);
				}
			}catch(ArrayIndexOutOfBoundsException m) {count = 0;}
		}

		//右斜め前直線のマスに色をつける
		for(int n = 1;n < 9;n++) {
			try {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i+n][j+n].getIcon()) == GOTE) {
					if(count == n) {
						count = 0;
					}
					break;
				}else if(Judge.judgeSenteOrGote(Data.komaLabel[i+n][j+n].getIcon()) == SENTE){
					if(count == n) {
						count = 0;
						break;
					}
					count = n + 1;
					Data.komaLabel[i+n][j+n].setOpaque(true);
					Data.komaLabel[i+n][j+n].setBackground(Color.red);
				}else {
					if(count == n) {
						count = 0;
						break;
					}
					Data.komaLabel[i+n][j+n].setOpaque(true);
					Data.komaLabel[i+n][j+n].setBackground(Color.red);
				}
			}catch(ArrayIndexOutOfBoundsException m) {count = 0;}
		}

	}

}
