import java.awt.Color;

public class RyuouC {
	final int SENTE = 0;
	final int GOTE = 1;
	final int NASHI = 2;

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

		try {//右斜め後ろのコマを味方のコマか判別している
			if(Judge.judgeSenteOrGote(Data.komaLabel[i-1][j+1].getIcon()) == GOTE){
			}else {
				//右斜め後ろのマスに色をつける
				Data.komaLabel[i-1][j+1].setOpaque(true);
				Data.komaLabel[i-1][j+1].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}

		try {//左斜め後ろのコマを味方のコマか判別している
			if(Judge.judgeSenteOrGote(Data.komaLabel[i-1][j-1].getIcon()) == GOTE){
			}else {
				//左斜め後ろのマスに色をつける
				Data.komaLabel[i-1][j-1].setOpaque(true);
				Data.komaLabel[i-1][j-1].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}


		try {//右斜め前にあるコマを味方のコマか判別している
			if(Judge.judgeSenteOrGote(Data.komaLabel[i+1][j+1].getIcon()) == GOTE){
			}else {
				//右斜め前のマスに色をつける
				Data.komaLabel[i+1][j+1].setOpaque(true);
				Data.komaLabel[i+1][j+1].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}

		try {//左斜め前にあるコマを味方のコマか判別している
			if(Judge.judgeSenteOrGote(Data.komaLabel[i+1][j-1].getIcon()) == GOTE){
			}else {
				//左斜め前のマスに色をつける
				Data.komaLabel[i+1][j-1].setOpaque(true);
				Data.komaLabel[i+1][j-1].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}
	}

}
