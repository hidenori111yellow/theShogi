import java.awt.Color;

public class KinC {
	final int SENTE = 0;
	final int GOTE = 1;
	final int NASHI = 2;

	void paintMasu(int i,int j) {
		try {//後ろのコマを味方のコマか判別している
			if(Judge.judgeSenteOrGote(Data.komaLabel[i-1][j].getIcon()) == GOTE){
			}else {
				//後ろのマスに色をつける
				Data.komaLabel[i-1][j].setOpaque(true);
				Data.komaLabel[i-1][j].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}

		try {//右にあるコマを味方のコマか判別している
			if(Judge.judgeSenteOrGote(Data.komaLabel[i][j+1].getIcon()) == GOTE){
			}else {
				//右のマスに色をつける
				Data.komaLabel[i][j+1].setOpaque(true);
				Data.komaLabel[i][j+1].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}

		try {//左にあるコマを味方のコマか判別している
			if(Judge.judgeSenteOrGote(Data.komaLabel[i][j-1].getIcon()) == GOTE){
			}else {
				//左のマスに色をつける
				Data.komaLabel[i][j-1].setOpaque(true);
				Data.komaLabel[i][j-1].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}

		try {//正面にあるコマを味方のコマか判別している
			if(Judge.judgeSenteOrGote(Data.komaLabel[i+1][j].getIcon()) == GOTE){
			}else {
				//正面のマスに色をつける
				Data.komaLabel[i+1][j].setOpaque(true);
				Data.komaLabel[i+1][j].setBackground(Color.red);
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
