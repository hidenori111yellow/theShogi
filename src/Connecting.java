import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Connecting extends JFrame implements ActionListener{

	JFrame connectF;

	Connecting(){
		setTitle("Connectiong");
		setLayout(null);

		setBounds(1030,200,500,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel connect = new JPanel();
		connect.setLayout(null);
		connect.setBounds(0,0,500,800);

		JLabel text = new JLabel("接続中・・・");
		text.setFont(new Font(Font.DIALOG,Font.BOLD,50));
		text.setBounds(90,150,360,70);

		JButton cancel = new JButton();
		cancel.setText("キャンセル");
		cancel.setFont(new Font(Font.DIALOG,Font.BOLD,25));
		cancel.setBounds(140,500,180,70);

		connect.add(text);
		connect.add(cancel);

		Container contentpane = getContentPane();

		contentpane.add(connect);

		cancel.addActionListener(this);

	}

	void setConnectF(JFrame connectF){
		this.connectF = connectF;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

		connectF.dispose();

		Home home = new Home();
		home.setHomeF(home);
		home.setVisible(true);

	}
}
