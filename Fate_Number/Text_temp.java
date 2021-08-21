package Fate_Number;

//Resultに直接関係せず、繰り返し使う可能性のあるテキストはここに格納
//些か強引にメソッド使ってる感あるが...

public class Text_temp extends Print_String { //汎用テキスト表示クラス

	public void txt_reEnter() {
		prtl("以下の例に習って再入力をお願いします。\n");
	}
	public void txt_example() {
		prtl("例１）1987年12月31日　→　19871231");
		prtl("例２）2000年1月1日　→　20000101");
	}
	public void txt_reEnterAll() { //txt_reEnter() とtxt_example()を呼び出すメソッド
		txt_reEnter();
		txt_example();
	}
}
