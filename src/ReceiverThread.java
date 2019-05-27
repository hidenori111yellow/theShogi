import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread{
	private static Socket socket;
	private  static BufferedReader reader;
	public ReceiverThread(Socket sInfo) throws IOException {
	   socket = sInfo;
	   reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));;
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ

		for (;;) {
		      // 受信する
		      String data;
		      try {
		        data = reader.readLine();
		        if(data.equals("bye")) {
		        	break;
		        }
		      }
		      catch(Exception ex) {
		        ex.printStackTrace();
		        break;
		      }
		      System.out.print("received:"+data+"\n");
		      new ReceiveData(data);

		      ClientConnection.myturn = true;
		 }

	}


	static void exit() {
		// 受信をクローズ
	    try {
		   if(reader != null) reader.close();
	    }
	    catch(Exception ex) {
	      ex.printStackTrace();
	    }
	}


}
