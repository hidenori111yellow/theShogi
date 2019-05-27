import java.awt.Color;

public class Fu {

	void paintMasu(int i,int j) {
		final int SENTE = 0;
		final int GOTE = 1;
		final int NASHI = 2;

		try {
			if(Judge.judgeSenteOrGote(Data.komaLabel[i-1][j].getIcon()) == SENTE) {
			}else {
				Data.komaLabel[i-1][j].setOpaque(true);
				Data.komaLabel[i-1][j].setBackground(Color.red);
			}
		}catch(ArrayIndexOutOfBoundsException m) {}

	}

}
