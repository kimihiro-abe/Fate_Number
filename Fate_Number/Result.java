package Fate_Number;

//占いの結果に関係する文章を格納したclass

public class Result extends Print_String {
	int judge;

	public void zorome(int judge) { //ゾロ目の時の判定。19990925は44になるが...参考資料に判定結果が無かったので適当に埋めました
	this.judge = judge;
		switch(judge) {
			case 1:
				rsltText1();
				prtn();
				prtl("★彡　時代の最先端、インフルエンサー　☆彡");
				prtn();
				prtl("・相性の良い運命数 → 2・4\r\n" +
						"・相性の悪い運命数 → 1・7");

				break; //ちなみにだが、breakはメソッド化出来ない（エラーでて明確な理由を知ったパターン汗
			case 2:
				rsltText1();
				prtn();
				prtl("★彡　豊かな才能がある、劇作家タイプ　☆彡");
				prtn();
				prtl("・相性の良い運命数 → 2・6\r\n" +
						"・相性の悪い運命数 → 9・11");

				break;
			case 3:
				rsltText1();
				prtn();
				prtl("★彡　不思議な力を持つ、魔術師タイプ　☆彡");
				prtn();
				prtl("・相性の良い運命数 → 1・8\r\n" +
						"・相性の悪い運命数 → 7・33");
				break;
			case 4:
				rsltText1();
				prtn();
				prtl("★彡　スタイリッシュ下校タイプ　☆彡");
				prtn();
				prtl("・相性の良い運命数 → ?\r\n" +
						"・相性の悪い運命数 → ?");
				break;
		}

	}
	public void general(int judge) { //引数で貰うのが一の位か十の位かの差異しかないので端折れる＾＾
	this.judge = judge;
		switch(judge) {
			case 1:
				prtn();
				prtl("★彡　運命を切り開く、パイオニア　☆彡");
				prtn();
				prtl("・相性の良い運命数 → 2・6\r\n" +
						"・相性の悪い運命数 → 5・8");
				break;
			case 2:
				prtn();
				prtl("★彡　涙もろい、心優しきコーディネーター　☆彡");
				prtn();
				prtl("・相性の良い運命数 → 1・8\r\n" +
						"・相性の悪い運命数 → 7・9");

				break;
			case 3:
				prtn();
				prtl("★彡　面倒見のよい、コーチ　☆彡");
				prtn();
				prtl("・相性の良い運命数 → 3・5\r\n" +
						"・相性の悪い運命数 → 11・33");
				break;
			case 4:
				prtn();
				prtl("★彡　正義感が強い、スーパーヒーロー　☆彡");
				prtn();
				prtl("・相性の良い運命数 → 7・11\r\n" +
						"・相性の悪い運命数 → 3・5");
				prtn();
				break;
			case 5:
				prtn();
				prtl("★彡　可憐で愛くるしい、エンジェル　☆彡");
				prtn();
				prtl("・相性の良い運命数 → 5・6\r\n" +
						"・相性の悪い運命数 → 1・4");
				break;
			case 6:
				prtn();
				prtl("★彡　慕われやすい、人気コンサルタント　☆彡");
				prtn();
				prtl("・相性の良い運命数 → 6・22\r\n" +
						"・相性の悪い運命数 → 4・9");
				break;
			case 7:
				prtn();
				prtl("★彡　研究大好き、学者タイプ　☆彡");
				prtn();
				prtl("・相性の良い運命数 → 7・33\r\n" +
						"・相性の悪い運命数 → 6・11");
			case 8:
				prtn();
				prtl("★彡　華やかなオーラがある、女優タイプ　☆彡");
				prtn();
				prtl("・相性の良い運命数 → 2・6\r\n" +
						"・相性の悪い運命数 → 1・33");
				break;
			case 9:
				prtn();
				prtl("★彡　空想の世界が好き、ファンタジー型　☆彡");
				prtn();
				prtl("・相性の良い運命数 → 8・33\r\n" +
						"・相性の悪い運命数 → 5・22");
				break;
		}
	}
	public void rsltText1() { //無理やりメソッドを使うというメソッド
		prtl("特別な運命数！");
	}
}

