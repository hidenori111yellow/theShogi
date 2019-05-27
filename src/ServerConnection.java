
import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JLabel;

public class ServerConnection {

	ServerSocket sSocket;

	Socket socket1;
	BufferedReader reader1;
	PrintWriter writer1;

	Socket socket2;
	BufferedReader reader2;
	PrintWriter writer2;

	ServerMovedData smd = new ServerMovedData();

	static int moveT[][] = new int[9][9];


	ServerConnection(){
		sSocket = null;
		socket1 = null;
		reader1 = null;
		writer1 = null;

		socket2 = null;
		reader2 = null;
		writer2 = null;


		try {
			sSocket = new ServerSocket();
			sSocket.bind(new InetSocketAddress
					("127.0.0.1",1111));

			System.out.println("クライアント1からの入力待ち状態");

			socket1 = sSocket.accept();


			reader1 = new BufferedReader
					(new InputStreamReader(socket1.getInputStream()));

			writer1 = new PrintWriter
					(socket1.getOutputStream(),true);

			writer1.println("SENTE");


			System.out.println("クライアント2からの入力待ち状態");


			socket2 = sSocket.accept();


			reader2 = new BufferedReader
					(new InputStreamReader(socket2.getInputStream()));

			writer2 = new PrintWriter
					(socket2.getOutputStream(),true);

			writer2.println("GOTE");


			String moveData1 = null;

			String moveData2 = null;


			while(true) {

				moveData1 = reader1.readLine();

				System.out.println(moveData1);



				writer2.println(moveData1);



				moveData2 = reader2.readLine();

				System.out.println(moveData2);

				writer1.println(moveData2);



				if(moveData1.equals("bye")
						|| moveData2.equals("bye")) {
					break;
				}

			}

		}catch(Exception e) {
			e.printStackTrace();
		}

	}


	void exit() {
			try {
				if(reader1 != null
						|| reader2 != null) {
					reader1.close();
					reader2.close();
				}

				if(writer1 != null
						|| writer2 != null) {
					writer1.close();
					writer2.close();
				}

				if(socket1 != null
						|| socket2 != null) {
					socket1.close();
					socket2.close();
				}

				if(sSocket != null) {
					sSocket.close();
				}

				System.out.println("サーバー側終了です");
			}catch (IOException e) {
				e.printStackTrace();
			}
	}

	void initKomaData(){



		for(int i = 0;i < 9;i++) {
			for(int j = 0;j < 9;j++) {

				moveT[i][j] = 0;
			}
		}

	}


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		new ServerConnection();

	}

}
