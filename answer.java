import java.util.Random; // ランダムを扱うためのプラグインをこのプログラムに読み込む

public class answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int num = 10; num >= -20; num--) { // numを10にセットして numが-20になるまで-1する
			Random random = new Random(); //　おまじない
			boolean result = random.nextBoolean(); // True or False のどちらかを変数 resultにプログラムが自動で代入する
			if (num % 2 == 0 && result == true) { // num が2で割り切れ、かつ、resultがTrueの場合
				System.out.println(num + "　÷ 2 = 0 です。 (true = 1)"); 
			}
			
			else if (num % 2 == 0 && result == false) { // num が2で割り切れ、かつ、resultがfalseの場合
				System.out.println(num + "　÷ 2 = 0 だと思います。 (false = 0)");
			}
			
			else if (num % 5 == 0 && result == true) { // num が5で割り切れ、かつ、resultがtrueの場合
				System.out.println(num + "　÷ 5 = 0 です。 (true = 1)");
			}
			
			else if (num % 5 == 0 && result == false) { // num が5で割り切れ、かつ、resultがfalseの場合
				System.out.println(num + "　÷ 5 = 0 だと思います。 (false = 0)");
			}
			
			else { // 上記のどれにも当てはまらない場合
				System.out.println(num + "　は未知の数値です。");
			}
			
			// 条件関係なしで出力する
			System.out.println("--------------------------------------");
		}

	}

}
