import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ConnectionBattle extends JFrame implements ActionListener{
	Data koma = new Data(); //Dataクラスのオブジェクトを生成
	static Container contentPane; //Container型の変数を定義
	BattleMove move = new BattleMove();

	//戻るボタンの生成
	JButton back = new JButton();

//	//読み込みボタンの生成
//	JButton load = new JButton();

	ConnectionBattle(String title){
		setTitle(title);
		setBounds(630,200,1300,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(null);

		//DataクラスのsetKomaLabel()メソッドでKomaLabel配列を初期化
		koma.setKomaLabel();

		//DataクラスのsetInitialPlacement()メソッドで駒を初期配置にセット
		koma.setInitialPlacement();

		//ContentPaneを取得
	    contentPane = getContentPane();

	    //DataクラスのsetVisible()メソッドですべてのコンポーネントをcontentPaneに追加
	    koma.setVisible(contentPane);


	    //戻るボタンの設定
	  	back.setText("戻る");
	  	back.setFont(new Font(Font.DIALOG,Font.BOLD,30));
	  	back.setBounds(50, 850, 100, 50);

//	  	//読み込みボタンの設定
//	  	load.setText("読み込み");
//	  	load.setFont(new Font(Font.DIALOG,Font.BOLD,30));
//	  	load.setBounds(300,850,180,50);


	    //DataクラスのkomaLabel配列をMouseListenerに追加
	    for(int i = 0;i < 9;i++) {
	    	for(int j = 0;j < 9;j++) {
	    		Data.komaLabel[i][j].addMouseListener(move);
	    	}
	    }


	    //Dataクラスの持ち駒ラベルをMouseListenerに追加
	    for(int i = 0;i < 18;i++) {
	    	Data.fuSenteMoti[i].addMouseListener(move);

	    	if(i < 2) {
		    	Data.hishaSenteMoti[i].addMouseListener(move);
		    	Data.kakuSenteMoti[i].addMouseListener(move);
		    }


		    if(i < 4) {
		    	Data.kinSenteMoti[i].addMouseListener(move);
		    	Data.ginSenteMoti[i].addMouseListener(move);
		        Data.keiSenteMoti[i].addMouseListener(move);
		        Data.kyouSenteMoti[i].addMouseListener(move);

		    }

	    }


	    new kifuShow(contentPane);

	    contentPane.add(back);
//	    contentPane.add(load);
	    back.addActionListener(this);
//	    load.addActionListener(this);

	    new kifuShow(contentPane);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

		if(e.getSource() == back) {



			ClientConnection.writer.println("bye");

			ReceiverThread.exit();

			ClientConnection.exit();

			this.dispose();


			Home home = new Home();
			home.setHomeF(home);
			home.setVisible(true);

		}
//		else if(e.getSource() == load) {
//			try {
//				if(ClientConnection.reader.ready() == true) {
//					String data = ClientConnection.reader.readLine();
//					System.out.println(data);
//					ClientConnection.myturn = true;
//					new ReceiveData(data);
//				}else {
//
//				}
//
//			}catch(Exception n) {
//				n.getStackTrace();
//			}
//		}

	}



}
