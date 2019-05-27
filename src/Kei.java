import java.awt.Color;

public class Kei {
	final int SENTE = 0;
	final int GOTE = 1;
	final int NASHI = 2;


	void paintMasu(int i,int j) {
		try {
			if(Judge.judgeSenteOrGote(Data.komaLabel[i-2][j-1].getIcon()) == SENTE){
			}else {
				//左へぴょんのマスに色をつける
				Data.komaLabel[i-2][j-1].setOpaque(true);
				Data.komaLabel[i-2][j-1].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}

		try {
			if(Judge.judgeSenteOrGote(Data.komaLabel[i-2][j+1].getIcon()) == SENTE){
			}else {
				//右へぴょんのマスに色をつける
				Data.komaLabel[i-2][j+1].setOpaque(true);
				Data.komaLabel[i-2][j+1].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}

	}
}
