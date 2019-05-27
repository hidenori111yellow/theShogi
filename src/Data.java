import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Data extends JFrame{

	static JLabel komaLabel[][] = new JLabel[9][9];

	//盤のラベル生成
	JLabel banLabel = new JLabel();

	//先手の持ち駒台のラベル生成
	JLabel senteDai = new JLabel();

	//後手の持ち駒台のラベル生成
	JLabel goteDai = new JLabel();

	//先手の持ち駒のラベル生成
	static JLabel[] hishaSenteMoti = new JLabel[2];
	static JLabel[] kakuSenteMoti = new JLabel[2];
	static JLabel[] kinSenteMoti = new JLabel[4];
	static JLabel[] ginSenteMoti = new JLabel[4];
	static JLabel[] keiSenteMoti = new JLabel[4];
	static JLabel[] kyouSenteMoti = new JLabel[4];
	static JLabel[] fuSenteMoti = new JLabel[18];

	//後手の持ち駒のラベル生成
	static JLabel[] hishaGoteMoti = new JLabel[2];
	static JLabel[] kakuGoteMoti = new JLabel[2];
	static JLabel[] kinGoteMoti = new JLabel[4];
	static JLabel[] ginGoteMoti = new JLabel[4];
	static JLabel[] keiGoteMoti = new JLabel[4];
	static JLabel[] kyouGoteMoti = new JLabel[4];
	static JLabel[] fuGoteMoti = new JLabel[18];



	static String userPath = "C:/Users/hiden/Documents/趣味/Java_Eclipse/pleiades/workspace/ShogiReal";

	//Homeの背景Image
	static ImageIcon homeImage = new ImageIcon(userPath
			+"/image/backgroundimage/白川郷/冬の白川郷_中.jpg");

	//盤のイメージアイコンの設定
	  static ImageIcon banImage = new ImageIcon(userPath
			  +"/image/japanese-chess-koma/japanese-chess/board/japanese-chess-b02.jpg");


	//駒のイメージアイコンの設定(先手)
	  static ImageIcon ouImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl01.png");
	  static ImageIcon hishaImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl02.png");
	  static ImageIcon kakuImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl03.png");
	  static ImageIcon kinImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl04.png");
	  static ImageIcon ginImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl05.png");
	  static ImageIcon keiImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl06.png");
	  static ImageIcon kyouImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl07.png");
	  static ImageIcon fuImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl08.png");
	  static ImageIcon gyokuImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl11.png");
	  static ImageIcon ryuouImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl12.png");
	  static ImageIcon ryumaImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl13.png");
	  static ImageIcon nariginImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl15.png");
	  static ImageIcon narikeiImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl16.png");
	  static ImageIcon narikyouImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl17.png");
	  static ImageIcon tokinImage = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl18.png");

	//駒のイメージアイコンの設定(後手)
	  static ImageIcon ouImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl31.png");
	  static ImageIcon hishaImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl32.png");
	  static ImageIcon kakuImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl33.png");
	  static ImageIcon kinImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl34.png");
	  static ImageIcon ginImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl35.png");
	  static ImageIcon keiImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl36.png");
	  static ImageIcon kyouImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl37.png");
	  static ImageIcon fuImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl38.png");
	  static ImageIcon gyokuImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl41.png");
	  static ImageIcon ryuouImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl42.png");
	  static ImageIcon ryumaImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl43.png");
	  static ImageIcon nariginImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl45.png");
	  static ImageIcon narikeiImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl46.png");
	  static ImageIcon narikyouImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl47.png");
	  static ImageIcon tokinImageC = new ImageIcon(userPath
			  +"./image/japanese-chess-koma/japanese-chess/koma/60x64/sgl48.png");




	//すべてのコマラベルを初期化するメソッド
    void setKomaLabel() {
		for(int i = 0;i < 9;i++) {
			for(int j = 0;j < 9;j++) {
				komaLabel[i][j] = new JLabel();
			}
		}
	}

    //将棋の初期配置を用意するメソッド
	void setInitialPlacement() {

		setLayout(null);

		//盤の設定
		banLabel.setIcon(banImage);
		banLabel.setBounds(335,100,700,700);

		//先手の持ち駒台の設定
		senteDai.setBounds(935,592,339,338);
		senteDai.setOpaque(true);
		senteDai.setBackground(Color.orange);

		//後手の持ち駒台の設定
		goteDai.setBounds(0,0,335,335);
		goteDai.setOpaque(true);
		goteDai.setBackground(Color.orange);

		for(int i = 0;i < 9;i++) {
			for(int j = 0;j < 9;j++) {
				if(komaLabel[i][j] == null) {
					komaLabel[i][j] = new JLabel();
				}
				komaLabel[i][j].setBounds(357+60*j+8,155+64*i+6,59,63);
			}
		}

        getMasu(9,1).setIcon(kyouImageC);
		getMasu(8,1).setIcon(keiImageC);
		getMasu(7,1).setIcon(ginImageC);
		getMasu(6,1).setIcon(kinImageC);
		getMasu(5,1).setIcon(ouImageC);
	    getMasu(4,1).setIcon(kinImageC);
	    getMasu(3,1).setIcon(ginImageC);
		getMasu(2,1).setIcon(keiImageC);
		getMasu(1,1).setIcon(kyouImageC);
		getMasu(8,2).setIcon(hishaImageC);
		getMasu(2,2).setIcon(kakuImageC);

		for(int i = 1;i <= 9;i++) {
			getMasu(i,3).setIcon(fuImageC);;
			getMasu(i,7).setIcon(fuImage);
		}

        getMasu(9,9).setIcon(kyouImage);
		getMasu(8,9).setIcon(keiImage);
		getMasu(7,9).setIcon(ginImage);
		getMasu(6,9).setIcon(kinImage);
		getMasu(5,9).setIcon(gyokuImage);
	    getMasu(4,9).setIcon(kinImage);
	    getMasu(3,9).setIcon(ginImage);
		getMasu(2,9).setIcon(keiImage);
		getMasu(1,9).setIcon(kyouImage);
		getMasu(2,8).setIcon(hishaImage);
		getMasu(8,8).setIcon(kakuImage);


		for(int i = 0;i < 18;i++) {
			fuSenteMoti[i] = new JLabel();
			//fuSenteMoti[i].setIcon(fuImage);
			fuSenteMoti[i].setBounds(940+15*i,600,60,64);

			fuGoteMoti[i] = new JLabel();
			//fuGoteMoti[i].setIcon(fuImageC);
			fuGoteMoti[i].setBounds(268-15*i,260,60,64);
		}


		for(int i = 0;i < 2;i++) {
			int x = 980;
			int y = 680;

			hishaSenteMoti[i] = new JLabel();
			//hishaSenteMoti[i].setIcon(hishaImage);
			hishaSenteMoti[i].setBounds(x+15*i,y,60,64);

			kakuSenteMoti[i] = new JLabel();
			//kakuSenteMoti[i].setIcon(kakuImage);
			kakuSenteMoti[i].setBounds(x+120+15*i,y,60,64);

			int xGote = 228;
			int yGote = 180;

			hishaGoteMoti[i] = new JLabel();
			//hishaGoteMoti[i].setIcon(hishaImageC);
			hishaGoteMoti[i].setBounds(xGote-15*i,yGote,60,64);

			kakuGoteMoti[i] = new JLabel();
			//kakuGoteMoti[i].setIcon(kakuImageC);
			kakuGoteMoti[i].setBounds(xGote-120-15*i,yGote,60,64);

		}

		for(int i = 0;i < 4;i++) {
			int x = 980;
			int y = 760;
			int btw = 15;
			kinSenteMoti[i] = new JLabel();
			//kinSenteMoti[i].setIcon(kinImage);
			kinSenteMoti[i].setBounds(x+btw*i,y,60,64);

			ginSenteMoti[i] = new JLabel();
			//ginSenteMoti[i].setIcon(ginImage);
			ginSenteMoti[i].setBounds(x+120+btw*i,y,60,64);

			keiSenteMoti[i] = new JLabel();
			//keiSenteMoti[i].setIcon(keiImage);
			keiSenteMoti[i].setBounds(x+btw*i,y+80,60,64);

			kyouSenteMoti[i] = new JLabel();
			//kyouSenteMoti[i].setIcon(kyouImage);
			kyouSenteMoti[i].setBounds(x+120+btw*i,y+80,60,64);

			int xGote =228;
			int yGote =90;

			kinGoteMoti[i] = new JLabel();
			//kinGoteMoti[i].setIcon(kinImageC);
			kinGoteMoti[i].setBounds(xGote-btw*i,yGote,60,64);

			ginGoteMoti[i] = new JLabel();
			//ginGoteMoti[i].setIcon(ginImageC);
			ginGoteMoti[i].setBounds(xGote-120-btw*i,yGote,60,64);

			keiGoteMoti[i] = new JLabel();
			//keiGoteMoti[i].setIcon(keiImageC);
			keiGoteMoti[i].setBounds(xGote-btw*i,yGote-80,60,64);

			kyouGoteMoti[i] = new JLabel();
			//kyouGoteMoti[i].setIcon(kyouImageC);
			kyouGoteMoti[i].setBounds(xGote-120-btw*i,yGote-80,60,64);

		}


	}

    //すべてのコマラベルと盤ラベルをContentPaneに追加して見える	ようにするメソッド
	void setVisible(Container contentPane) {
		for(int i = 0;i < 9;i++) {
			for(int j = 0;j < 9;j++) {
				contentPane.add(komaLabel[i][j]);
			}
		}
		contentPane.add(banLabel);

		for(int i = 0; i < 18;i ++) {
			contentPane.add(fuSenteMoti[i]);

			contentPane.add(fuGoteMoti[i]);
		}

		for(int i = 0;i < 2;i++) {
			contentPane.add(hishaSenteMoti[i]);

			contentPane.add(kakuSenteMoti[i]);

			contentPane.add(hishaGoteMoti[i]);

			contentPane.add(kakuGoteMoti[i]);
		}

		for(int i = 0;i < 4;i++) {
			contentPane.add(kinSenteMoti[i]);

			contentPane.add(ginSenteMoti[i]);

			contentPane.add(keiSenteMoti[i]);

			contentPane.add(kyouSenteMoti[i]);

			contentPane.add(kinGoteMoti[i]);

			contentPane.add(ginGoteMoti[i]);

			contentPane.add(keiGoteMoti[i]);

			contentPane.add(kyouGoteMoti[i]);
		}

		contentPane.add(senteDai);
		contentPane.add(goteDai);



	}


    //komaLabelのひとつを取り出すメソッド
	JLabel getMasu(int x, int y){
			int i = y - 1;
		    int j = 9 - x;
		    return komaLabel[i][j];
	}

	//komaLabelのひとつを新しいJLabelと入れ替えるメソッド
	void setMasu(int x,int y,JLabel koma){
		int i = y - 1;
		int j = 9 - x;
		komaLabel[i][j] = koma;

	}


	void cleanMasuColor() {
		for(int n = 0;n < 9;n++) {
			for(int k = 0;k < 9;k++) {

				Data.komaLabel[n][k].setBackground(null);
			    Data.komaLabel[n][k].setOpaque(false);

			}
		}
	}


	void enteredMasu(JLabel source) {
		loop: for(int i = 0;i < 9;i++) {
    		for(int j = 0;j < 9;j++) {
    			if(Data.komaLabel[i][j] == source){
    				if(Data.komaLabel[i][j].getBackground() == Color.red) {

    				}else if(Data.komaLabel[i][j].getBackground() == Color.GREEN){
    				}else {
    					Data.komaLabel[i][j].setOpaque(true);
        				Data.komaLabel[i][j].setBackground(Color.white);
    				}
    					break loop;
    			}
    		}
    	}
	}

	void exitedMasu(JLabel source) {
		loop: for(int i = 0;i < 9;i++) {
    		for(int j = 0;j < 9;j++) {
    			if(Data.komaLabel[i][j] == source) {
    				if(Data.komaLabel[i][j].getBackground() == Color.white) {
    					Data.komaLabel[i][j].setBackground(null);
        				Data.komaLabel[i][j].setOpaque(false);
    				}
    					break loop;
    			}
    		}
    	}
	}






}
