import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JLabel;

public class Move implements MouseListener,Shogi{

	Data koma = new Data(); //Dataクラスのオブジェクトを生成
	Judge judge = new Judge(); //Judgeクラスのオブジェクトを生成

	kifuShow kifushow = new kifuShow();

	int tesuuCount = 1;
	JLabel firstKomaLabel = null; //初めにPressしたマスのJLabelを格納する変数を用意
	Icon firstKoma = null;
	JLabel secondKomaLabel = null; //2番目にPressしたマスのJLabelを格納する変数を用意
	Icon secondKoma = null;
	int firstI = -1;  //初めにPressしたマスの縦の位置
	int secondI = -1; //2番目にPressしたマスの縦の位置
	int secondJ = -1;
	int status = -1;

	JLabel currentKomaLabel = null;
	Icon currentKoma = null;
	int currentI = -1;
	int currentJ = -1;

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



	//先手の持ち駒のオブジェクトを生成
	HishaSenteMoti hishaSenteMoti = new HishaSenteMoti();
	KakuSenteMoti kakuSenteMoti = new KakuSenteMoti();
	KinSenteMoti kinSenteMoti = new KinSenteMoti();
	GinSenteMoti ginSenteMoti = new GinSenteMoti();
	KeiSenteMoti keiSenteMoti = new KeiSenteMoti();
	KyouSenteMoti kyouSenteMoti = new KyouSenteMoti();
	FuSenteMoti fuSenteMoti = new FuSenteMoti();

	//後手の持ち駒のオブジェクトを生成
	HishaGoteMoti hishaGoteMoti = new HishaGoteMoti();
	KakuGoteMoti kakuGoteMoti = new KakuGoteMoti();
	KinGoteMoti kinGoteMoti = new KinGoteMoti();
	GinGoteMoti ginGoteMoti = new GinGoteMoti();
	KeiGoteMoti keiGoteMoti = new KeiGoteMoti();
	KyouGoteMoti kyouGoteMoti = new KyouGoteMoti();
	FuGoteMoti fuGoteMoti = new FuGoteMoti();



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


    	hishaGoteMoti.enteredMasu(e.getSource());
    	kakuGoteMoti.enteredMasu(e.getSource());
    	kinGoteMoti.enteredMasu(e.getSource());
    	ginGoteMoti.enteredMasu(e.getSource());
    	keiGoteMoti.enteredMasu(e.getSource());
    	kyouGoteMoti.enteredMasu(e.getSource());
    	fuGoteMoti.enteredMasu(e.getSource());


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

    	hishaGoteMoti.exitedMasu(e.getSource());
    	kakuGoteMoti.exitedMasu(e.getSource());
    	kinGoteMoti.exitedMasu(e.getSource());
    	ginGoteMoti.exitedMasu(e.getSource());
    	keiGoteMoti.exitedMasu(e.getSource());
    	kyouGoteMoti.exitedMasu(e.getSource());
    	fuGoteMoti.exitedMasu(e.getSource());



    	//盤上のマスから出たときの処理
    	koma.exitedMasu((JLabel)e.getSource());
    }


    //マウスの右クリックがコンポーネント上で押されたときに処理されるメソッド
    @Override
    public void mousePressed(MouseEvent e) {

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


		//盤上のマスの動けるところに色つけ処理(後手番)
		if(currentKoma == Data.ouImageC) {

			ou.paintMasu(currentI, currentJ);

		}else if(currentKoma == Data.hishaImageC) {

			hishaC.paintMasu(currentI, currentJ);

		}else if(currentKoma == Data.kakuImageC) {

			kakuC.paintMasu(currentI, currentJ);

		}else if(currentKoma == Data.kinImageC) {

			kinC.paintMasu(currentI, currentJ);

		}else if(currentKoma == Data.ginImageC) {

			ginC.paintMasu(currentI, currentJ);

		}else if(currentKoma == Data.keiImageC) {

			keiC.paintMasu(currentI, currentJ);

		}else if(currentKoma == Data.kyouImageC) {

			kyouC.paintMasu(currentI, currentJ);

		}else if(currentKoma == Data.fuImageC) {

			fuC.paintMasu(currentI, currentJ);

		}else if(currentKoma == Data.ryuouImageC) {

			ryuouC.paintMasu(currentI, currentJ);

		}else if(currentKoma == Data.ryumaImageC) {

		    ryumaC.paintMasu(currentI, currentJ);

		}else if(currentKoma == Data.nariginImageC) {

			nariginC.paintMasu(currentI, currentJ);

		}else if(currentKoma == Data.narikeiImageC) {

			narikeiC.paintMasu(currentI, currentJ);

		}else if(currentKoma == Data.narikyouImageC) {

			narikyouC.paintMasu(currentI, currentJ);

		}else if(currentKoma == Data.tokinImageC) {

			tokinC.paintMasu(currentI, currentJ);

		}



        //////持ち駒を打てるマスの色つけ処理/////
		for(int i = 0;i < 18;i++) {
			if(i < 2) {
				if(Data.hishaSenteMoti[i] == e.getSource()) {

		    		hishaSenteMoti.paintMasu();
		    		currentKomaLabel = Data.hishaSenteMoti[i];
		    		currentKoma = Data.hishaSenteMoti[i].getIcon();

		    	}else if(Data.kakuSenteMoti[i] == e.getSource()) {

		    		kakuSenteMoti.paintMasu();
		    		currentKomaLabel = Data.kakuSenteMoti[i];
		    	    currentKoma = Data.kakuSenteMoti[i].getIcon();

		    	}


				if(Data.hishaGoteMoti[i] == e.getSource()) {
		    		hishaGoteMoti.paintMasu();
		    		currentKomaLabel = Data.hishaGoteMoti[i];
		            currentKoma = Data.hishaGoteMoti[i].getIcon();

		    	}else if(Data.kakuGoteMoti[i] == e.getSource()) {
		    		kakuGoteMoti.paintMasu();
		    		currentKomaLabel = Data.kakuGoteMoti[i];
		            currentKoma = Data.kakuGoteMoti[i].getIcon();

		    	}
			}


			if(i < 4) {

		    	if(Data.kinSenteMoti[i] == e.getSource()) {
		    		kinSenteMoti.paintMasu();
		    		currentKomaLabel = Data.kinSenteMoti[i];
		            currentKoma = Data.kinSenteMoti[i].getIcon();

		    	}else if(Data.ginSenteMoti[i] == e.getSource()) {
		    		ginSenteMoti.paintMasu();
		    		currentKomaLabel = Data.ginSenteMoti[i];
		            currentKoma = Data.ginSenteMoti[i].getIcon();

		    	}else if(Data.keiSenteMoti[i] == e.getSource()) {
		    		keiSenteMoti.paintMasu();
		    		currentKomaLabel = Data.keiSenteMoti[i];
		            currentKoma = Data.keiSenteMoti[i].getIcon();

		    	}else if(Data.kyouSenteMoti[i] == e.getSource()) {
		    		kyouSenteMoti.paintMasu();
		    		currentKomaLabel = Data.kyouSenteMoti[i];
		            currentKoma = Data.kyouSenteMoti[i].getIcon();

		    	}


		    	if(Data.kinGoteMoti[i] == e.getSource()) {
		    		kinGoteMoti.paintMasu();
		    		currentKomaLabel = Data.kinGoteMoti[i];
		            currentKoma = Data.kinGoteMoti[i].getIcon();

		    	}else if(Data.ginGoteMoti[i] == e.getSource()) {
		    		ginGoteMoti.paintMasu();
		    		currentKomaLabel = Data.ginGoteMoti[i];
		            currentKoma = Data.ginGoteMoti[i].getIcon();

		    	}else if(Data.keiGoteMoti[i] == e.getSource()) {
		    		keiGoteMoti.paintMasu();
		    		currentKomaLabel = Data.keiGoteMoti[i];
		            currentKoma = Data.keiGoteMoti[i].getIcon();

		    	}else if(Data.kyouGoteMoti[i] == e.getSource()) {
		    		kyouGoteMoti.paintMasu();
		    		currentKomaLabel = Data.kyouGoteMoti[i];
		            currentKoma = Data.kyouGoteMoti[i].getIcon();

		    	}


			}


	        if(Data.fuSenteMoti[i] == e.getSource()) {
	    		fuSenteMoti.paintMasu();
	    		currentKomaLabel = Data.fuSenteMoti[i];
	            currentKoma = Data.fuSenteMoti[i].getIcon();

	    	}

	        if(Data.fuGoteMoti[i] == e.getSource()) {
	    		fuGoteMoti.paintMasu();
	    		currentKomaLabel = Data.fuGoteMoti[i];
	            currentKoma = Data.fuGoteMoti[i].getIcon();

	    	}

		}




///////////////////////////////駒の入れ替え/////////////////////////////////////

		//1回目に選択したコマ
		if(firstKoma == null) {

			firstKoma = currentKoma;
			firstKomaLabel = currentKomaLabel;


 			firstI = currentI;


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

					}//後手番の成るかどうかの判断
					else if((9 >= firstI && firstI >= 6 || 9 >= secondI && secondI >= 6)
							 && Judge.judgeSenteOrGote(firstKoma) == GOTE) {
						//NariDialogを用いて、成るかならないかの判断をしてもらう
						if(firstKoma == Data.fuImageC) {
							if(secondI == 8) {
								tmp.setIcon(Data.tokinImageC);
								status = NARI;
							}else {
								NariDialog dialog = new NariDialog();
								if(dialog.getNariJudge()) {
									tmp.setIcon(Data.tokinImageC);
									status = NARI;
								}
							}
 					    }else if(firstKoma == Data.hishaImageC) {
 						    NariDialog dialog = new NariDialog();
							if(dialog.getNariJudge()) {
								tmp.setIcon(Data.ryuouImageC);
								status = NARI;
							}
 					    }else if(firstKoma == Data.kakuImageC) {
 						    NariDialog dialog = new NariDialog();
							if(dialog.getNariJudge()) {
								tmp.setIcon(Data.ryumaImageC);
								status = NARI;
							}
 					    }else if(firstKoma == Data.ginImageC) {
 						    NariDialog dialog = new NariDialog();
							if(dialog.getNariJudge()) {
								tmp.setIcon(Data.nariginImageC);
								status = NARI;
							}
 					    }else if(firstKoma == Data.keiImageC) {
 					    	if(secondI >= 7) {
 					    		tmp.setIcon(Data.narikeiImageC);
 					    		status = NARI;
 					    	}else {
 					    		NariDialog dialog = new NariDialog();
 								if(dialog.getNariJudge()) {
 									tmp.setIcon(Data.narikeiImageC);
 									status = NARI;
 								}
 					    	}
 					    }else if(firstKoma == Data.kyouImageC) {
 					    	if(secondI == 8) {
 					    		tmp.setIcon(Data.narikyouImageC);
 					    		status = NARI;
 					    	}else {
 					    		NariDialog dialog = new NariDialog();
 								if(dialog.getNariJudge()) {
 									tmp.setIcon(Data.narikyouImageC);
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


					//棋譜のデータをDefaultListModelに追加
					kifushow.setData(tesuuCount,judge.IndexToKifunum(secondI, secondJ),
							judge.StringToKanji(judge.IconToString(firstKoma)));

					tesuuCount++;

				}


				//盤のマスの色をすべて消す
				koma.cleanMasuColor();



				firstKoma = null;
				firstI = -1;
				secondKoma = null;
				secondI = -1;
				secondJ = -1;
				firstKomaLabel = null;
				secondKomaLabel = null;

		}



        currentKoma = null;
        currentKomaLabel = null;
        currentI = -1;
        currentJ = -1;


    }



    //マウスの右クリックがコンポーネント上で離されたときに処理されるメソッド
    @Override
    public void mouseReleased(MouseEvent e) {
    	// TODO 自動生成されたメソッド・スタブ

    }



}

