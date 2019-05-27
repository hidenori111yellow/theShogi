
public class ReceiveData implements Shogi{

	Judge judge = new Judge();

	ReceiveData(String data){
		String[] datas = data.split("");
		int firstI = Integer.parseInt(datas[0]);
		int firstJ = Integer.parseInt(datas[1]);
		int secondI = Integer.parseInt(datas[2]);
		int secondJ = Integer.parseInt(datas[3]);


		String tail = "";

		for(int i = 4;i < datas.length; i++) {
			tail += datas[i];
		}

		String[] tails = tail.split(",");

		String koma = tails[0];

		String status = tails[1];


		if(firstI == 9 && firstJ == 9) {

			if(koma.equals("null")) {
				System.out.println("error");

			}else {
			    System.out.println("data = " + koma);

				new MoveGoteKoma(judge.SenteIndexToGoteIndex(secondI, secondJ),koma);
			}
		}else {

			if(status.equals(String.valueOf(NARI))) {
				new MoveGoteKoma(judge.SenteIndexToGoteIndex(firstI, firstJ),judge.SenteIndexToGoteIndex(secondI, secondJ),status);

			}else {
				new MoveGoteKoma(judge.SenteIndexToGoteIndex(firstI, firstJ),judge.SenteIndexToGoteIndex(secondI, secondJ));
			}
		}

	}

}
