import java.awt.Color;

public class Ryuma {
	final int SENTE = 0;
	final int GOTE = 1;
	final int NASHI = 2;

	void paintMasu(int i,int j) {
		int count = 0;
		//左斜め前直線のマスに色をつける
		for(int n = 1;n < 9;n++) {
			try {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i-n][j-n].getIcon()) == SENTE) {
					if(count == n) {
						count = 0;
					}
					break;
				}else if(Judge.judgeSenteOrGote(Data.komaLabel[i-n][j-n].getIcon()) == GOTE){
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

		//右斜め前直線のマスに色をつける
		for(int n = 1;n < 9;n++) {
			try {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i-n][j+n].getIcon()) == SENTE) {
					if(count == n) {
						count = 0;
					}
					break;
				}else if(Judge.judgeSenteOrGote(Data.komaLabel[i-n][j+n].getIcon()) == GOTE){
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

		//左斜め後ろ直線のマスに色をつける
		for(int n = 1;n < 9;n++) {
			try {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i+n][j-n].getIcon()) == SENTE) {
					if(count == n) {
						count = 0;
					}
					break;
				}else if(Judge.judgeSenteOrGote(Data.komaLabel[i+n][j-n].getIcon()) == GOTE){
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

		//右斜め後ろ直線のマスに色をつける
		for(int n = 1;n < 9;n++) {
			try {
				if(Judge.judgeSenteOrGote(Data.komaLabel[i+n][j+n].getIcon()) == SENTE) {
					if(count == n) {
						count = 0;
					}
					break;
				}else if(Judge.judgeSenteOrGote(Data.komaLabel[i+n][j+n].getIcon()) == GOTE){
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

		try {//正面にあるコマを味方のコマか判別している
			if(Judge.judgeSenteOrGote(Data.komaLabel[i-1][j].getIcon()) == SENTE) {
			}else {
				//正面のマスに色をつける
				Data.komaLabel[i-1][j].setOpaque(true);
				Data.komaLabel[i-1][j].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}

		try {//右にあるコマを味方のコマか判別している
			if(Judge.judgeSenteOrGote(Data.komaLabel[i][j+1].getIcon()) == SENTE) {
			}else {
				//右のマスに色をつける
				Data.komaLabel[i][j+1].setOpaque(true);
				Data.komaLabel[i][j+1].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}


		try {//左にあるコマを味方のコマか判別している
			if(Judge.judgeSenteOrGote(Data.komaLabel[i][j-1].getIcon()) == SENTE) {
			}else {
				//左のマスに色をつける
				Data.komaLabel[i][j-1].setOpaque(true);
				Data.komaLabel[i][j-1].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}


		try {//後ろにあるコマを味方のコマか判別している
			if(Judge.judgeSenteOrGote(Data.komaLabel[i+1][j].getIcon()) == SENTE) {
			}else {
				//後ろのマスに色をつける
				Data.komaLabel[i+1][j].setOpaque(true);
				Data.komaLabel[i+1][j].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}


	}

}
