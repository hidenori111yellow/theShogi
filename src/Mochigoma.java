
public interface Mochigoma {

	//先手の持ち駒のオブジェクトを生成
		HishaSenteMoti hishaSenteMoti = new HishaSenteMoti();
		KakuSenteMoti kakuSenteMoti = new KakuSenteMoti();
		KinSenteMoti kinSenteMoti = new KinSenteMoti();
		GinSenteMoti ginSenteMoti = new GinSenteMoti();
		KeiSenteMoti keiSenteMoti = new KeiSenteMoti();
		KyouSenteMoti kyouSenteMoti = new KyouSenteMoti();
		FuSenteMoti fuSenteMoti = new FuSenteMoti();

		//後手の持ち駒のオブジェクトを生成
		HishaGoteMoti hishaGoteMoti = new HishaGoteMoti();
		KakuGoteMoti kakuGoteMoti = new KakuGoteMoti();
		KinGoteMoti kinGoteMoti = new KinGoteMoti();
		GinGoteMoti ginGoteMoti = new GinGoteMoti();
		KeiGoteMoti keiGoteMoti = new KeiGoteMoti();
		KyouGoteMoti kyouGoteMoti = new KyouGoteMoti();
		FuGoteMoti fuGoteMoti = new FuGoteMoti();

}
