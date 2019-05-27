
import javax.swing.JDialog;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NariDialog extends JDialog implements ActionListener{
	private boolean nariJudge;

	JButton yesButton;
	JButton noButton;

	NariDialog(){

		  setTitle("成るか成らないか");

		  setLayout(null);

		  setBounds(1000, 500, 500, 250);

		  setModal(true);

		  JLabel text = new JLabel("成りますか?");
		  text.setBounds(90,10,200,60);
		  text.setFont(new Font(Font.DIALOG,Font.BOLD,25));

		  yesButton = new JButton("Yes");
		  yesButton.setBounds(90,90,100,60);
		  yesButton.setFont(new Font(Font.DIALOG,Font.BOLD,20));


		  noButton = new JButton("No");
		  noButton.setBounds(280,90,100,60);
		  noButton.setFont(new Font(Font.DIALOG,Font.BOLD,20));

		  Container contentPane = getContentPane();


		  contentPane.add(text);

		  contentPane.add(yesButton);

		  contentPane.add(noButton);

		  yesButton.addActionListener(this);
		  noButton.addActionListener(this);



		  setVisible(true);



	}

	public boolean getNariJudge(){
		return nariJudge;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

		if(yesButton == e.getSource()) {

			nariJudge = true;
			dispose();
		}else if(noButton == e.getSource()) {

			nariJudge = false;
			dispose();
		}
	}

}


//import javax.swing.JDialog;
//import javax.swing.JOptionPane;
//
//public class NariDialog{
//	private boolean nariJudge;
//
//	NariDialog(){
//
//	    JDialog dialog = new JDialog((JDialog)null,"hello",true);
//	    dialog.show();
//	    dialog.dispose();
//
//
//	}
//
//	public boolean getNariJudge(){
//		return nariJudge;
//	}
//
//}
