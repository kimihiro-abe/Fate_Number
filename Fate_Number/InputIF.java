package Fate_Number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.InputMismatchException;

public class InputIF extends Print_String {
	public String data_ymd_strg; // data_ymd_strg : ymdはdata_ymd_strgの略
	public int data_ymd_int;


	public String inputStrg2int() { //Strg2int = Strg to intの略
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Text_temp txt = new Text_temp(); //汎用テキスト表示メソッド使うための準備

		//日付の判定にCalendarクラス使う
		Calendar cl = Calendar.getInstance();
		//setLenientメソッドでfalseを設定、厳密な日時判定する場合はfalse
	    cl.setLenient(false);

        try {
        	data_ymd_strg = br.readLine(); //例外が起こりうる処理
        	data_ymd_int = Integer.parseInt(data_ymd_strg);

            int yyyy = Integer.parseInt(data_ymd_strg.substring(0, 4));
            int mm = Integer.parseInt(data_ymd_strg.substring(4, 6));
            int dd = Integer.parseInt(data_ymd_strg.substring(6, 8));
            cl.set(yyyy, mm-1, dd); //日付をセットする。monthだけ0始まりの罠がある。つまり0が1月。
            cl.getTime(); //誤った値を入れるとエラー出るので、結果としてcatchの一番最後のやつに引っかかるのを正誤判定に利用。

        }
        catch (InputMismatchException e) {
        	prtl("数値以外が入力されました。"); //例外が起こった時
        	txt.txt_reEnterAll(); //「以下の例に習って～」文と入力例を表示するメソッド
        	inputStrg2int(); //このメソッドを再呼び出しして再入力。
        }
        catch (NumberFormatException e) { //念のために入れたが..いるかな（？＿？；
			prtl("数値以外が入力されました"); //例外が起こった時
        	txt.txt_reEnterAll();
			inputStrg2int(); //このメソッドを再呼び出しして再入力。
        }
		catch (IOException e) {
			prtl(e + "何がしかのエラー（・＿・；");
        	txt.txt_reEnterAll();
			inputStrg2int(); //このメソッドを再呼び出しして再入力。
		}
        catch (Exception e) {
        	prtl("その日付は存在しません！＞＜");
        	txt.txt_reEnterAll();
			inputStrg2int(); //このメソッドを再呼び出しして再入力。
        }

      //確認済みの生年月日の数字を返す。
        return data_ymd_strg;
	}
}

