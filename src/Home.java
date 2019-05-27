import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Home extends JFrame implements ActionListener{

	JFrame homeF;

	JButton battle;
	JButton kentou;

	Home() {
		setTitle("Home");
		setLayout(null);

		setBounds(1030,200,500,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel home = new JPanel();
		home.setLayout(null);
		home.setBounds(0,0,500,800);

		JLabel backgroundLabel = new JLabel();
		backgroundLabel.setBounds(0,0,500,800);

		backgroundLabel.setIcon(Data.homeImage);

		JLabel title = new JLabel("The将棋");
		title.setFont(new Font(Font.DIALOG,Font.BOLD,50));
		title.setForeground(Color.yellow);
		title.setBounds(130,150,360,70);

	    battle = new JButton();
		battle.setText("通信対戦");
		battle.setFont(new Font(Font.DIALOG,Font.BOLD,25));
		battle.setBounds(140,350,180,70);

		JButton senseki = new JButton();
		senseki.setText("戦績");
		senseki.setFont(new Font(Font.DIALOG,Font.BOLD,25));
		senseki.setBounds(140,450,180,70);

		kentou = new JButton();
		kentou.setText("検討室");
		kentou.setFont(new Font(Font.DIALOG,Font.BOLD,25));
		kentou.setBounds(140,550,180,70);

		home.add(title);
		home.add(battle);
		home.add(senseki);
		home.add(kentou);
		home.add(backgroundLabel);

		Container contentpane = getContentPane();


		contentpane.add(home);

		battle.addActionListener(this);

		kentou.addActionListener(this);

	}

	void setHomeF(JFrame homeF){
		this.homeF = homeF;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

		if(kentou == e.getSource()) {
			homeF.dispose();

			//Kentouクラスのオブジェクトを生成
			Kentou frame = new Kentou("shogi");

			//見えるようにしている
			frame.setVisible(true);

		}else if(battle == e.getSource()) {
			homeF.dispose();

			//Connectingクラスのオブジェクトを生成
//			Connecting connect = new Connecting();
//			connect.setConnectF(connect);
//			connect.setVisible(true);

			ClientConnection cc = new ClientConnection();
			cc.start(cc);
		}
	}


}
