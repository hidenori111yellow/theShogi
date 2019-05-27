import javax.swing.Icon;
import javax.swing.JLabel;

public class Judge extends Data implements Shogi{

	//先手のコマか後手のコマかどうか判別するメソッド(対戦の場合は相手の駒かどうか判別するメソッド)
		static int judgeSenteOrGote(Icon icon) {
			if(icon == gyokuImage || icon == hishaImage || icon == kakuImage || icon == kinImage
				|| icon == ginImage || icon == keiImage || icon == kyouImage || icon ==fuImage
				|| icon == ryuouImage || icon == ryumaImage || icon == nariginImage
				|| icon == narikeiImage || icon == narikyouImage || icon == tokinImage) {

				return SENTE;
			}else if(icon == ouImageC || icon == hishaImageC || icon == kakuImageC || icon == kinImageC
					 || icon == ginImageC || icon == keiImageC || icon == kyouImageC || icon == fuImageC
					 || icon == ryuouImageC || icon == ryumaImageC || icon == nariginImageC
					 || icon == narikeiImageC || icon == narikyouImageC || icon == tokinImageC){

				return GOTE;
			}else {
				return NASHI;
			}
		}


	//持ち駒かどうかの判断をするメソッド
		static boolean judgeMoti(JLabel label) {
			for(int i = 0;i < 18;i++) {
				if(label == fuSenteMoti[i]) {
					return true;
				}else if(label == fuGoteMoti[i]) {
					return true;
				}

				if(i < 2) {
					if(label == hishaSenteMoti[i] || label == kakuSenteMoti[i]) {
						return true;
					}else if(label == hishaGoteMoti[i] || label == kakuGoteMoti[i]) {
						return true;
					}
				}

				if(i < 4) {
					if(label == kinSenteMoti[i] || label == ginSenteMoti[i]
						|| label == keiSenteMoti[i] || label == kyouSenteMoti[i]) {
						return true;
					}else if(label == kinGoteMoti[i] || label == ginGoteMoti[i]
							  || label == keiGoteMoti[i] || label == kyouGoteMoti[i]) {
						return true;
					}
				}
			}

			return false;

		}


		//駒の成り駒を返すメソッド
		Icon ToNariGoma(Icon icon) {
			if(icon == hishaImage) {
				return ryuouImage;
			}else if(icon == hishaImageC) {
				return ryuouImageC;
			}else if(icon == kakuImage) {
				return ryumaImage;
			}else if(icon == kakuImageC) {
				return ryumaImageC;
			}else if(icon == ginImage) {
				return nariginImage;
			}else if(icon == ginImageC) {
				return nariginImageC;
			}else if(icon == keiImage) {
				return narikeiImage;
			}else if(icon == keiImageC) {
				return narikeiImageC;
			}else if(icon == kyouImage) {
				return narikyouImage;
			}else if(icon == kyouImageC) {
				return narikyouImageC;
			}else if(icon == fuImage) {
				return tokinImage;
			}else if(icon == fuImageC) {
				return tokinImageC;
			}else {
				System.out.println("error");
				return ouImage;
			}
		}



		//IconをStringに変換するメソッド
		String IconToString(Icon icon) {
			if(icon == ouImage || icon == ouImageC) {
				return "ou";
			}else if(icon == gyokuImage || icon == gyokuImageC) {
				return "gyoku";
			}else if(icon == hishaImage || icon == hishaImageC) {
				return "hisha";
			}else if(icon == kakuImage || icon == kakuImageC) {
				return "kaku";
			}else if(icon == kinImage || icon == kinImageC) {
				return "kin";
			}else if(icon == ginImage || icon == ginImageC) {
				return "gin";
			}else if(icon == keiImage || icon == keiImageC) {
				return "kei";
			}else if(icon == kyouImage || icon == kyouImageC) {
				return "kyou";
			}else if(icon == fuImage || icon == fuImageC) {
				return "fu";
			}else if(icon == ryuouImage || icon == ryuouImageC) {
				return "ryuou";
			}else if(icon == ryumaImage || icon == ryumaImageC) {
				return "ryuma";
			}else if(icon == nariginImage || icon == nariginImageC) {
				return "narigin";
			}else if(icon == narikeiImage || icon == narikeiImageC) {
				return "narikei";
			}else if(icon == narikyouImage || icon == narikyouImageC) {
				return "narikyou";
			}else if(icon == tokinImage || icon == tokinImageC) {
				return "tokin";
			}else {
				return "nashi";
			}
		}


		//Stringを漢字に変換するメソッド
		String StringToKanji(String str) {
			if(str.equals("ou")) {
				return "王";
			}else if(str.equals("gyoku")) {
				return "玉";
			}else if(str.equals("hisha")) {
				return "飛車";
			}else if(str.equals("kaku")) {
				return "角";
			}else if(str.equals("kin")) {
				return "金";
			}else if(str.equals("gin")) {
				return "銀";
			}else if(str.equals("kei")) {
				return "桂";
			}else if(str.equals("kyou")) {
				return "香";
			}else if(str.equals("fu")) {
				return "歩";
			}else if(str.equals("ryuou")) {
				return "竜";
			}else if(str.equals("ryuma")) {
				return "馬";
			}else if(str.equals("narigin")) {
				return "成銀";
			}else if(str.equals("narikei")) {
				return "成桂";
			}else if(str.equals("narikyou")) {
				return "成香";
			}else if(str.equals("tokin")) {
				return "と金";
			}else {
				return "nashi";
			}
		}


		//参照元の駒の位置データを数値に変換するメソッド
		int[] IndexToKifunum(int i,int j){
			int y = i + 1;
			int x = 9 - j;
			int[] xy = {x,y};

			return xy;
		}

		//先手の駒の位置データを後手の駒の位置データに変換するメソッド
		int[] SenteIndexToGoteIndex(int SenteI,int SenteJ){
			int goteI = 8 - SenteI;
			int goteJ = 8 - SenteJ;
			int[] IJ = {goteI,goteJ};

			return IJ;
		}
}
