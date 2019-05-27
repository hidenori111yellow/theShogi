import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class kifuShow implements Shogi{

	static DefaultListModel kifuData = new DefaultListModel();;
	JList kifuList = new JList(kifuData);
	JScrollPane sp = new JScrollPane();


	kifuShow(){

	}

	kifuShow(Container contentPane){

		kifuList.setFont(new Font(Font.DIALOG,Font.BOLD,28));
		sp.getViewport().setView(kifuList);
	    sp.setBounds(935,129,340,471);
	    JScrollBar sb = sp.getVerticalScrollBar();
	    sb.setBounds(935,129,100,100);

		contentPane.add(sp);

	}

	void setData(int tesuuCount,int[] place,String kind){



		if(tesuuCount % 2 == 1) {
			kifuData.addElement(tesuuCount + ":" + place[0] + place[1] + kind);
		}else if(tesuuCount % 2 == 0) {
			kifuData.addElement(tesuuCount + ":" + place[0] + place[1] + kind);
		}
	}

	void setData(int tesuuCount,int[] place,String king,int status) {

	}








//	public static void main(String args[]) {
//		JFrame frame = new JFrame();
//		frame.setTitle("practice");
//		frame.setLayout(null);
//		frame.setBounds(100,100,1300,1000);
//		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//		Container contentpane = frame.getContentPane();
//
////		String[] str = {"i","j","n","k"};
////		kifuList.addElement(str);
////
////		/* 初期データをモデルに追加する */
////	    StringBuffer sb;
////	    for (int i = 0 ; i < 100 ; i++){
////	      sb = new StringBuffer();
////	      sb.append("項目");
////	      sb.append(i);
////	      kifuList.addElement(new String(sb));
////	    }
//
//
//
//		JList list = new JList(kifuList);
//
//		JScrollPane sp = new JScrollPane();
//		sp.getViewport().setView(list);
////		sp.setLayout(null);
//		sp.setBounds(10,10,500,500);
//
////		JPanel p = new JPanel();
////		p.setLayout(null);;
////		p.setBounds(10,10,1000,1000);
////		p.add(sp);
////
//		contentpane.add(sp);
//
//		frame.setVisible(true);
//
//	}




}