package Fate_Number;

//プリント専用メソッド集。
//他のclassで強引にextendsさせて使うことにしました。

public class Print_String {

	// ここからの３つString型表示系printメソッド。
	public static void prt(String str) { //print()と同じ
		System.out.print(str);
	}
	public static void prtl(String str) { //println()と同じ
		System.out.println(str);
	}
	public static void prtn() { //改行するだけのメソッド。
		System.out.print("\n");
	}
}
