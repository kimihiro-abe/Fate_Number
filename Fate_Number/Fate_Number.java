package Fate_Number;

public class Fate_Number extends Print_String {

	private static int ymdTotal; //yyyymmddのそれぞれの桁を足した合計値
	private static String ymdTotal2Strg; //ymdTotalToStringの略。あまり略になっていない。
	private final static int magicN = 11; //magic numberの略。ゾロ目の特別な運命数の判定に使用

	public static void Init_setting() { //ymdTotalをリセットするだけのメソッド
		ymdTotal = 0;
		}

	public static void main(String[] args) throws InterruptedException {
		Init_setting(); //強引にメソッド使っていくスタイル
		Text_temp txt = new Text_temp(); //汎用テキスト表示メソッド使うための準備

		// prt.prtl.prtnはPrint_Stringに作ったprint関連のメソッド
		prtl(".｡*ﾟ+.*.｡　あなたの運命数を占う　ﾟ+..｡*ﾟ+\n");
		prtl("あなたの生年月日を以下の例に習って入力してください。\n");
		txt.txt_example(); //メソッドを使うことになれるため、やや強引に使う。
		prtn();

		// 入力
		InputIF iIF = new InputIF(); //入力クラスのインスタンス生成
		String ymd = iIF.inputStrg2int() ; //インプット後、処理され返ってきた物を変数に代入

		// 配列に入れる処理　その１：準備
		prtl("\n～　運命数の判定　～\n");
		char[] ymdArray = new char[8]; //返ってきた数列を桁ごとに分解していれる箱を作る

		// 配列に入れる処理　その２：
    	ymdArray = ymd.toCharArray(); // toCharArrayメソッド使って格納。
		prtn();

		// 配列に入れた数を１つ１つ取り出し＆表示演出＆合計値計算
		// 全配列の最後の１つ前まで計算：getNumericValueは指定されたUnicode文字が表すint値を返す。
		int rpt = 0; //repeatの略
		while (rpt < ymdArray.length-1) {
	    	prt(ymdArray[rpt] + " + ");
	    	Thread.sleep(150);
	    	ymdTotal += Character.getNumericValue(ymdArray[rpt]);
	    	rpt++;
		}
		// 全配列の最後に格納してある配列分を計算
			ymdTotal += Character.getNumericValue(ymdArray[rpt]);
	    	prt(ymdArray[rpt] + " = "); //最後の数字表示のあと「＝」を表示するので分けることにしました。
	    	Thread.sleep(750); //結果発表前のタメ時間処理
	    	prtl(ymdTotal + "\n");
	    	Thread.sleep(150);

		//判定処理　下処理
	    prtn();
	    prt("あなたの運命数「" + ymdTotal + "」は...\t");

	    //一の位と十の位の処理をする為の配列を作る。ymdTotalを配列に入れます。
	    int[] fateArray = new int[2];

	    // この状態の運命数を、そのまま入れると10の位がない場合があるのを対処（例：20000101...など）
	    if (ymdTotal<10) { //
	    	ymdTotal2Strg = String.format("%02d", ymdTotal); //十の位に０を書き足す処置
	    }
	    else {
	    	ymdTotal2Strg = String.valueOf(ymdTotal); //int型をString型に変換
	    }

	    // 配列に入れる
	    int tenth = 0; //十の位
	    int first = 0; //一の位

		for (int i = 0; i < 2; i++) {
	    	fateArray[i] = ymdTotal2Strg.charAt(i); //
	    	tenth = Character.getNumericValue(fateArray[0]); //十の位
	    	first = Character.getNumericValue(fateArray[1]); //一の位
		}

	    //判定処理　メイン処理部分
		//判定は3種考える「１，ゾロ目の特別な運命数」「２，一の位がゼロの時」「３，一の位がゼロ以外」
		Result rslt = new Result(); //結果判定用クラスを強引に使うので、インスタンス生成。

		//11の倍数になる特別な運命数の判定
		if ((ymdTotal % magicN) == 0) { //この条件式で11の倍数の特別な運命数を対処する
				rslt.zorome(first); //結果判定メソッドに一の位の数字を投げて結果判定と表示。ゾロ目だから十の位でもok
		}
		else {
			//一の位が『ゼロの時』の判定。一の位がゼロなので結果判定は十の位の数で行う。
			if(first == 0){
				//prtl("\t[デバッグ]：一の位が『ゼロの時』の判定");
				rslt.general(tenth); //結果判定メソッドに十の位の数字を投げて結果判定と表示。
			}
			//↑のif文の条件とメソッドに渡す引数から、一の位が『ゼロ以外の時（つまり１～９）』となる。
			else {
				//prtl("\t[デバッグ]：一の位が『ゼロ以外』の時の判定");
				rslt.general(first); //結果判定メソッドに一の位の数字を投げて結果判定と表示。
			}
		}
		prtn();
		prtl("\nおわり～(・∀・)！！\n");

	}

}
