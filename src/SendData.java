
public class SendData {

	SendData(){

	}

	String SendData(int firstI,int firstJ,int secondI,int secondJ,String mochiKind,int status){
		String data = "" + firstI + firstJ + secondI + secondJ + mochiKind + "," + status;

		return data;
	}

}
