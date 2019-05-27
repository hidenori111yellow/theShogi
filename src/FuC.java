import java.awt.Color;

public class FuC {
	final int SENTE = 0;
	final int GOTE = 1;
	final int NASHI = 2;

	void paintMasu(int i,int j) {
		try {
			//正面のマスに色をつける
			Data.komaLabel[i+1][j].setOpaque(true);
			Data.komaLabel[i+1][j].setBackground(Color.red);
		}catch(ArrayIndexOutOfBoundsException m) {}

	}

}
