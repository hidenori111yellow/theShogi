
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Kentou extends JFrame implements ActionListener{

	Data koma = new Data(); //Dataクラスのオブジェクトを生成
	static Container contentPane; //Container型の変数を定義
	Move move = new Move();

	//戻るボタンの生成
	JButton back = new JButton();


	Kentou(String title){
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


	    //DataクラスのkomaLabel配列をMouseListenerに追加
	    for(int i = 0;i < 9;i++) {
	    	for(int j = 0;j < 9;j++) {
	    		Data.komaLabel[i][j].addMouseListener(move);
	    	}
	    }


	    //Dataクラスの持ち駒ラベルをMouseListenerに追加
	    for(int i = 0;i < 18;i++) {
	    	Data.fuSenteMoti[i].addMouseListener(move);

	    	Data.fuGoteMoti[i].addMouseListener(move);

	    	if(i < 2) {
		    	Data.hishaSenteMoti[i].addMouseListener(move);
		    	Data.kakuSenteMoti[i].addMouseListener(move);

		    	Data.hishaGoteMoti[i].addMouseListener(move);
		    	Data.kakuGoteMoti[i].addMouseListener(move);
		    }


		    if(i < 4) {
		    	Data.kinSenteMoti[i].addMouseListener(move);
		    	Data.ginSenteMoti[i].addMouseListener(move);
		        Data.keiSenteMoti[i].addMouseListener(move);
		        Data.kyouSenteMoti[i].addMouseListener(move);

		    	Data.kinGoteMoti[i].addMouseListener(move);
		    	Data.ginGoteMoti[i].addMouseListener(move);
		        Data.keiGoteMoti[i].addMouseListener(move);
		        Data.kyouGoteMoti[i].addMouseListener(move);

		    }

	    }


	    contentPane.add(back);
	    back.addActionListener(this);

	    new kifuShow(contentPane);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

		this.dispose();

		ClientConnection.writer.println("bye");


		Home home = new Home();
		home.setHomeF(home);
		home.setVisible(true);

	}


}




