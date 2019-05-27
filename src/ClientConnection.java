import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientConnection {
	static Socket cSocket;
	static BufferedReader csInput;
	static PrintWriter writer;
	static BufferedReader reader;
	static boolean myturn = false;


	void start(ClientConnection cc){
		cSocket = null;

		csInput = null;

		writer = null;

		reader = null;

		try {

			Connecting connect = new Connecting();
			connect.setConnectF(connect);
			connect.setVisible(true);

			cSocket = new Socket("127.0.0.1", 1111);

			csInput = new BufferedReader
					(new InputStreamReader(System.in));

			writer = new PrintWriter
					(cSocket.getOutputStream(), true);

			reader = new BufferedReader
					(new InputStreamReader
							(cSocket.getInputStream()));

			connect.dispose();



			String tejun = reader.readLine();

			if(tejun.equals("SENTE")){
				myturn = true;
			}else if(tejun.equals("GOTE")) {
				myturn = false;
			}

			new ReceiverThread(cSocket).start();


			ConnectionBattle battle = new ConnectionBattle("battle");
			battle.setVisible(true);



		}catch (Exception e) {
			e.printStackTrace();
		}

	}


	public void receive() {
		try {

			if(reader.ready()) {
				System.out.println(reader.readLine());
			}

		}catch(Exception n) {
			n.getStackTrace();
		}
	}


	static void exit() {

		try {
			if(reader != null) {
				reader.close();
			}

			if(writer != null) {
				writer.close();
			}

			if(csInput != null) {
				csInput.close();
			}

			if(cSocket != null) {
				cSocket.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

		System.out.println("クライアント側終了です");
	}

//	void SendData() {
//		writer.println();
//	}



}
