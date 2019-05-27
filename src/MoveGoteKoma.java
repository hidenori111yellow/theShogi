import javax.swing.Icon;
import javax.swing.JLabel;

public class MoveGoteKoma implements Mochigoma,Shogi{
	Judge judge = new Judge();

	MoveGoteKoma(int[] first, int[] second){
		JLabel firstKomaLabel = Data.komaLabel[first[0]][first[1]];
	    Icon firstKoma = firstKomaLabel.getIcon();
	    JLabel secondKomaLabel = Data.komaLabel[second[0]][second[1]];
		Icon secondKoma= secondKomaLabel.getIcon();


	    JLabel tmp = new JLabel();
	    tmp.setIcon(firstKoma);

		firstKomaLabel.setIcon(null);

		//持ち駒台に取った駒を移す処理
		if(secondKoma == null) {
		}else if(secondKoma == Data.hishaImage
	    		 || secondKoma == Data.ryuouImage) {
			hishaGoteMoti.getHisha();
		}else if(secondKoma == Data.kakuImage
				 || secondKoma == Data.ryumaImage) {
			kakuGoteMoti.getKaku();
		}else if(secondKoma == Data.kinImage) {
			kinGoteMoti.getKin();
		}else if(secondKoma == Data.ginImage
				 || secondKoma == Data.nariginImage) {
			ginGoteMoti.getGin();
		}else if(secondKoma == Data.keiImage
				 || secondKoma == Data.narikeiImage) {
			keiGoteMoti.getKei();
		}else if(secondKoma == Data.kyouImage
				 || secondKoma == Data.narikyouImage) {
			kyouGoteMoti.getKyou();
		}else if(secondKoma == Data.fuImage
				 || secondKoma == Data.tokinImage) {
			fuGoteMoti.getFu();
		}

		secondKomaLabel.setIcon(tmp.getIcon());
	}


	MoveGoteKoma(int[] first, int[] second,String status){
		JLabel firstKomaLabel = Data.komaLabel[first[0]][first[1]];
	    Icon firstKoma = firstKomaLabel.getIcon();
	    JLabel secondKomaLabel = Data.komaLabel[second[0]][second[1]];
		Icon secondKoma= secondKomaLabel.getIcon();


	    JLabel tmp = new JLabel();
	    tmp.setIcon(firstKoma);

		firstKomaLabel.setIcon(null);

		//持ち駒台に取った駒を移す処理
		if(secondKoma == null) {
		}else if(secondKoma == Data.hishaImage
	    		 || secondKoma == Data.ryuouImage) {
			hishaGoteMoti.getHisha();
		}else if(secondKoma == Data.kakuImage
				 || secondKoma == Data.ryumaImage) {
			kakuGoteMoti.getKaku();
		}else if(secondKoma == Data.kinImage) {
			kinGoteMoti.getKin();
		}else if(secondKoma == Data.ginImage
				 || secondKoma == Data.nariginImage) {
			ginGoteMoti.getGin();
		}else if(secondKoma == Data.keiImage
				 || secondKoma == Data.narikeiImage) {
			keiGoteMoti.getKei();
		}else if(secondKoma == Data.kyouImage
				 || secondKoma == Data.narikyouImage) {
			kyouGoteMoti.getKyou();
		}else if(secondKoma == Data.fuImage
				 || secondKoma == Data.tokinImage) {
			fuGoteMoti.getFu();
		}

		secondKomaLabel.setIcon(judge.ToNariGoma(tmp.getIcon()));

	}




	MoveGoteKoma(int[] second,String koma){
		Icon tmp = null;
		JLabel secondKomaLabel = Data.komaLabel[second[0]][second[1]];
		Icon secondKoma= secondKomaLabel.getIcon();

		//駒を持ち駒台から移動させる
		if(koma.equals("hisha")) {
			tmp = Data.hishaGoteMoti[0].getIcon();
			Data.hishaGoteMoti[0].setIcon(null);

		}else if(koma.equals("kaku")) {
			tmp = Data.kakuGoteMoti[0].getIcon();
			Data.kakuGoteMoti[0].setIcon(null);

		}else if(koma.equals("kin")) {
			tmp = Data.kinGoteMoti[0].getIcon();
			Data.kinGoteMoti[0].setIcon(null);

		}else if(koma.equals("gin")) {
			tmp = Data.ginGoteMoti[0].getIcon();
			Data.ginGoteMoti[0].setIcon(null);

		}else if(koma.equals("kei")) {
			tmp = Data.keiGoteMoti[0].getIcon();
			Data.keiGoteMoti[0].setIcon(null);

		}else if(koma.equals("kyou")) {
			tmp = Data.kyouGoteMoti[0].getIcon();
			Data.kyouGoteMoti[0].setIcon(null);

		}else if(koma.equals("fu")) {
			tmp = Data.fuGoteMoti[0].getIcon();
			Data.fuGoteMoti[0].setIcon(null);
		}

//		//持ち駒を右詰めに整理する(後手ver)
//		hishaGoteMoti.rearrange();
//		kakuGoteMoti.rearrange();
//		kinGoteMoti.rearrange();
//		ginGoteMoti.rearrange();
//		keiGoteMoti.rearrange();
//		kyouGoteMoti.rearrange();
//		fuGoteMoti.rearrange();


		secondKomaLabel.setIcon(tmp);

	}


}
