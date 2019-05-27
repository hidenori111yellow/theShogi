import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JLabel;

public class BattleMove implements MouseListener,Shogi,Mochigoma{

	Data koma = new Data(); //Dataクラスのオブジェクトを生成
	Judge judge = new Judge(); //Judgeクラスのオブジェクトを生成

	kifuShow kifushow = new kifuShow();
	SendData senddata = new SendData();

	int tesuuCount = 1;
	JLabel firstKomaLabel = null; //初めにPressしたマスのJLabelを格納する変数を用意
	Icon firstKoma = null;
	JLabel secondKomaLabel = null; //2番目にPressしたマスのJLabelを格納する変数を用意
	Icon secondKoma = null;
	int firstI = 9;  //初めにPressしたマスの縦の位置
	int firstJ = 9;
	int secondI = 9; //2番目にPressしたマスの縦の位置
	int secondJ = 9;
	int status = -1;

	JLabel currentKomaLabel = null;
	Icon currentKoma = null;
	int currentI = 9;
	int currentJ = 9;

	static String mochiKind;

	//先手の駒のオブジェクトを生成
	Gyoku gyoku = new Gyoku();
	Hisha hisha = new Hisha();
	Kaku kaku = new Kaku();
	Kin kin = new Kin();
	Gin gin = new Gin();
	Kei kei = new Kei();
	Kyou kyou = new Kyou();
	Fu fu = new Fu();

	//先手の駒のオブジェクトを生成(成駒ver)
	Ryuou ryuou = new Ryuou();
	Ryuma ryuma = new Ryuma();
	Narigin narigin = new Narigin();
	Narikei narikei = new Narikei();
	Narikyou narikyou = new Narikyou();
	Tokin tokin = new Tokin();

	//後手の駒のオブジェクトを生成
	Ou ou = new Ou();
	HishaC hishaC = new HishaC();
	KakuC kakuC = new KakuC();
	KinC kinC = new KinC();
	GinC ginC = new GinC();
	KeiC keiC = new KeiC();
	KyouC kyouC = new KyouC();
	FuC fuC = new FuC();

	//後手の駒のオブジェクトを生成(成駒ver)
	RyuouC ryuouC = new RyuouC();
	RyumaC ryumaC = new RyumaC();
	NariginC nariginC = new NariginC();
	NarikeiC narikeiC = new NarikeiC();
	NarikyouC narikyouC = new NarikyouC();
	TokinC tokinC = new TokinC();


	//マウスの右クリックがコンポーネント上で押されて離されたときに処理されるメソッド
    @Override
	public void mouseClicked(MouseEvent e) {

 	}


    //マウスがコンポーネント上に入ったときに処理されるメソッド
    @Override
    public void mouseEntered(MouseEvent e) {

    	hishaSenteMoti.enteredMasu(e.getSource());
    	kakuSenteMoti.enteredMasu(e.getSource());
    	kinSenteMoti.enteredMasu(e.getSource());
    	ginSenteMoti.enteredMasu(e.getSource());
    	keiSenteMoti.enteredMasu(e.getSource());
    	kyouSenteMoti.enteredMasu(e.getSource());
    	fuSenteMoti.enteredMasu(e.getSource());

    	//盤上のマスに入った時の処理
    	koma.enteredMasu((JLabel)e.getSource());
    }


    //マウスがコンポーネント上から出たときに処理されるメソッド
    @Override
    public void mouseExited(MouseEvent e) {

    	hishaSenteMoti.exitedMasu(e.getSource());
    	kakuSenteMoti.exitedMasu(e.getSource());
    	kinSenteMoti.exitedMasu(e.getSource());
    	ginSenteMoti.exitedMasu(e.getSource());
    	keiSenteMoti.exitedMasu(e.getSource());
    	kyouSenteMoti.exitedMasu(e.getSource());
    	fuSenteMoti.exitedMasu(e.getSource());

    	//盤上のマスから出たときの処理
    	koma.exitedMasu((JLabel)e.getSource());
    }


    //マウスの右クリックがコンポーネント上で押されたときに処理されるメソッド
    @Override
    public void mousePressed(MouseEvent e) {

    	if(ClientConnection.myturn == false) {

    	}else if(ClientConnection.myturn == true) {
    		for(int i = 0;i < 9; i++) {
        		for(int j = 0;j < 9; j++) {
        			if(Data.komaLabel[i][j] == e.getSource()) {
        				currentKomaLabel = Data.komaLabel[i][j];
        				currentKoma = Data.komaLabel[i][j].getIcon();
        				currentI = i;
        				currentJ = j;
        			}
        		}
        	}


        	//盤上のマスの動けるところに色つけ処理(先手番)
    		if(currentKoma == Data.gyokuImage) {

    			gyoku.paintMasu(currentI, currentJ);

    		}else if(currentKoma == Data.hishaImage) {

    			hisha.paintMasu(currentI,currentJ);

    		}else if(currentKoma == Data.kakuImage) {

    			kaku.paintMasu(currentI, currentJ);

    		}else if(currentKoma == Data.kinImage) {

    			kin.paintMasu(currentI,currentJ);

    	    }else if(currentKoma == Data.ginImage) {

    		   gin.paintMasu(currentI, currentJ);

    		}else if(currentKoma == Data.keiImage) {

    			kei.paintMasu(currentI, currentJ);

    		}else if(currentKoma == Data.kyouImage) {

    			kyou.paintMasu(currentI, currentJ);

    		}else if(currentKoma == Data.fuImage) {

    			fu.paintMasu(currentI, currentJ);

    		}else if(currentKoma == Data.ryuouImage) {

    			ryuou.paintMasu(currentI, currentJ);

    		}else if(currentKoma == Data.ryumaImage) {

    			ryuma.paintMasu(currentI, currentJ);

    		}else if(currentKoma == Data.nariginImage) {

    			narigin.paintMasu(currentI, currentJ);

    		}else if(currentKoma == Data.narikeiImage) {

    			narikei.paintMasu(currentI, currentJ);

    		}else if(currentKoma == Data.narikyouImage) {

    			narikyou.paintMasu(currentI, currentJ);

    		}else if(currentKoma == Data.tokinImage) {

    			tokin.paintMasu(currentI, currentJ);

    		}


            //////持ち駒を打てるマスの色つけ処理/////
    		for(int i = 0;i < 18;i++) {
    			if(i < 2) {
    				if(Data.hishaSenteMoti[i] == e.getSource()) {

    		    		hishaSenteMoti.paintMasu();
    		    		currentKomaLabel = Data.hishaSenteMoti[i];
    		    		currentKoma = Data.hishaSenteMoti[i].getIcon();
    		    	    mochiKind = "hisha";


    		    	}else if(Data.kakuSenteMoti[i] == e.getSource()) {

    		    		kakuSenteMoti.paintMasu();
    		    		currentKomaLabel = Data.kakuSenteMoti[i];
    		    	    currentKoma = Data.kakuSenteMoti[i].getIcon();
    		    	    mochiKind = "kaku";

    		    	}

    			}


    			if(i < 4) {

    		    	if(Data.kinSenteMoti[i] == e.getSource()) {
    		    		kinSenteMoti.paintMasu();
    		    		currentKomaLabel = Data.kinSenteMoti[i];
    		            currentKoma = Data.kinSenteMoti[i].getIcon();
    		            mochiKind = "kin";

    		    	}else if(Data.ginSenteMoti[i] == e.getSource()) {
    		    		ginSenteMoti.paintMasu();
    		    		currentKomaLabel = Data.ginSenteMoti[i];
    		            currentKoma = Data.ginSenteMoti[i].getIcon();
    		            mochiKind = "gin";

    		    	}else if(Data.keiSenteMoti[i] == e.getSource()) {
    		    		keiSenteMoti.paintMasu();
    		    		currentKomaLabel = Data.keiSenteMoti[i];
    		            currentKoma = Data.keiSenteMoti[i].getIcon();
    		            mochiKind = "kei";

    		    	}else if(Data.kyouSenteMoti[i] == e.getSource()) {
    		    		kyouSenteMoti.paintMasu();
    		    		currentKomaLabel = Data.kyouSenteMoti[i];
    		            currentKoma = Data.kyouSenteMoti[i].getIcon();
    		            mochiKind = "kyou";

    		    	}

    			}


    	        if(Data.fuSenteMoti[i] == e.getSource()) {
    	    		fuSenteMoti.paintMasu();
    	    		currentKomaLabel = Data.fuSenteMoti[i];
    	            currentKoma = Data.fuSenteMoti[i].getIcon();
    	            mochiKind = "fu";

    	    	}

    		}



    ///////////////////////////////駒の入れ替え/////////////////////////////////////

    		//1回目に選択したコマ
    		if(firstKoma == null) {

    			firstKoma = currentKoma;
    			firstKomaLabel = currentKomaLabel;


     			firstI = currentI;
     			firstJ = currentJ;


     			if(firstKoma == null) {
     				System.out.println("駒のあるマスをクリックしてください");
     			}else {

     				//最初に選択したマスを緑にする
     	 			firstKomaLabel.setOpaque(true);
     	 			firstKomaLabel.setBackground(Color.GREEN);

     			}

    		//2回目に選択したコマ
    		}else {
    				secondKoma = currentKoma;
    				secondKomaLabel = currentKomaLabel;
    				secondI = currentI;
    				secondJ = currentJ;

    				//コマの入れ替え処理
    				if(secondKomaLabel.getBackground() == Color.red) {

    					changePlace();

    					ClientConnection.writer.println(senddata.SendData(firstI, firstJ, secondI, secondJ,mochiKind,status));

    					//棋譜のデータをDefaultListModelに追加
    					kifushow.setData(tesuuCount,judge.IndexToKifunum(secondI, secondJ),
    							judge.StringToKanji(judge.IconToString(firstKoma)));

//    					try {
//
//    						String readData = ClientConnection.reader.readLine();
//
//    				    	if(readData.equals("SENTE")) {
//
//    					    }else if(readData.equals("GOTE")) {
//    					    	System.out.println(ClientConnection.reader.readLine());
//    					    }else {
//    					    	System.out.println(readData);
//    					    }
//    				    }catch(Exception n) {
//    				    	n.printStackTrace();
//    				    }


    					tesuuCount++;
    					ClientConnection.myturn = false;


    				}


    				//盤のマスの色をすべて消す
    				koma.cleanMasuColor();



    				firstKoma = null;
    				firstI = 9;
    				firstJ = 9;
    				secondKoma = null;
    				secondI = 9;
    				secondJ = 9;
    				firstKomaLabel = null;
    				secondKomaLabel = null;
    				mochiKind = null;
    				status = -1;


    		}



            currentKoma = null;
            currentKomaLabel = null;
            currentI = 9;
            currentJ = 9;


    	}

    }



    //マウスの右クリックがコンポーネント上で離されたときに処理されるメソッド
    @Override
    public void mouseReleased(MouseEvent e) {
    	// TODO 自動生成されたメソッド・スタブ

    }



    void changePlace() {
    	JLabel tmp = new JLabel();
		tmp.setIcon(firstKoma);


		if(Judge.judgeMoti(firstKomaLabel)) {


		//先手番の成るかどうかの判断
		}else if((0 <= firstI && firstI <= 2 || 0 <=secondI && secondI <= 2)
				&& Judge.judgeSenteOrGote(firstKoma) == SENTE) {
			//NariDialogをつかって、成るかならないかの判断をしてもらう
			if(firstKoma == Data.fuImage) {
				if(secondI == 0) {
					tmp.setIcon(Data.tokinImage);
					status = NARI;
				}else {
					NariDialog dialog = new NariDialog();
					if(dialog.getNariJudge()) {
						tmp.setIcon(Data.tokinImage);
						status = NARI;
					}
				}
			    }else if(firstKoma == Data.hishaImage) {
				    NariDialog dialog = new NariDialog();
				if(dialog.getNariJudge()) {
					tmp.setIcon(Data.ryuouImage);
					status = NARI;
				}
			    }else if(firstKoma == Data.kakuImage) {
				    NariDialog dialog = new NariDialog();
				if(dialog.getNariJudge()) {
					tmp.setIcon(Data.ryumaImage);
					status = NARI;
				}
			    }else if(firstKoma == Data.ginImage) {
				    NariDialog dialog = new NariDialog();
				if(dialog.getNariJudge()) {
					tmp.setIcon(Data.nariginImage);
					status = NARI;
				}
			    }else if(firstKoma == Data.keiImage) {
			    	if(secondI <= 1) {
			    		tmp.setIcon(Data.narikeiImage);
			    		status = NARI;
			    	}else {
			    		NariDialog dialog = new NariDialog();
						if(dialog.getNariJudge()) {
							tmp.setIcon(Data.narikeiImage);
							status = NARI;
						}
			    	}
			    }else if(firstKoma == Data.kyouImage) {
			    	if(secondI == 0) {
			    		tmp.setIcon(Data.narikyouImage);
			    		status = NARI;
			    	}else {
			    		NariDialog dialog = new NariDialog();
						if(dialog.getNariJudge()) {
							tmp.setIcon(Data.narikyouImage);
							status = NARI;
						}
			    	}
			    }
		}


		firstKomaLabel.setIcon(null);

		//持ち駒を左詰めに整理する(先手ver)
		hishaSenteMoti.rearrange();
		kakuSenteMoti.rearrange();
		kinSenteMoti.rearrange();
		ginSenteMoti.rearrange();
		keiSenteMoti.rearrange();
		kyouSenteMoti.rearrange();
		fuSenteMoti.rearrange();

		//持ち駒を右詰めに整理する(後手ver)
		hishaGoteMoti.rearrange();
		kakuGoteMoti.rearrange();
		kinGoteMoti.rearrange();
		ginGoteMoti.rearrange();
		keiGoteMoti.rearrange();
		kyouGoteMoti.rearrange();
		fuGoteMoti.rearrange();



		//持ち駒台に取った駒を移す処理
		if(secondKoma == null) {
		}else if(secondKoma == Data.hishaImageC
				 || secondKoma == Data.ryuouImageC) {
			hishaSenteMoti.getHishaC();
		}else if(secondKoma == Data.kakuImageC
				 || secondKoma == Data.ryumaImageC) {
			kakuSenteMoti.getKakuC();
		}else if(secondKoma == Data.kinImageC) {
			kinSenteMoti.getKinC();
		}else if(secondKoma == Data.ginImageC
				 || secondKoma == Data.nariginImageC) {
			ginSenteMoti.getGinC();
		}else if(secondKoma == Data.keiImageC
				 || secondKoma == Data.narikeiImageC) {
			keiSenteMoti.getKeiC();
		}else if(secondKoma == Data.kyouImageC
				 || secondKoma == Data.narikyouImageC) {
			kyouSenteMoti.getKyouC();
		}else if(secondKoma == Data.fuImageC
			     || secondKoma == Data.tokinImageC){
		    fuSenteMoti.getFuC();
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


}
