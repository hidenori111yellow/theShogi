
public class ServerMovedData {

	static String koma[] = new String[81];
	
//	static String koma[][] = {{"kyouC","keiC","ginC","kinC","ouC","kinC","ginC","keiC","kyouC"}, -4
//            {"","hishaC","","","","","","kakuC",""}, -3
//            {"fuC","fuC","fuC","fuC","fuC","fuC","fuC","fuC","fuC"}, -2
//            {"","","","","","","","",""}, -1
//            {"","","","","","","","",""}, 0
//            {"","","","","","","","",""}, 1
//            {"fu","fu","fu","fu","fu","fu","fu","fu","fu"}, 2
//            {"",   "kaku", "",   "",    "",    "",   "", "hisha", ""}, 3
//            {"kyou","kei","gin","kin","gyoku","kin","gin","kei","kyou"} 4
//	             -4    -3    -2    -1      0      1     2     3      4
//              }
	
	void setKoma() {
		for(int i = 0;i < 81;i++) {
			int x = i%9 - 4;
			int y = i/9 - 4;
			
			if(y == 2) {
				koma[i] = "fu";
			}
			if(y == 3 && x == ) {
				koma[i] = "kaku";
			}else if(y == 3 && x == 3) {
				koma[i] = "hisha";
			}
			
			if(y == 4) {
				switch(x) {
				case 1:
					koma[i] = "kin";
					break;
				case 2:
					koma[i] = "gin";
					break;
				case 3:
					koma[i] = "kei";
					break;
				case 4:
					koma[i] = "kyou";
					break;
				}
			}
			if(y == 4 && x == 3) {
				
			}
			if(y == 4 && )
			
			
			
			
		}
	};


	ServerMovedData(){

	}


	void Moved(String data) {

        


	}




}
