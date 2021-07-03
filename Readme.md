# 練習問題作ってみた

10 ~ 20の間以下の処理をするプログラムを書きなさい。

10 ~ 20の値を代入する変数は`num`とする

また、true or falseをランダムに変数`result`に代入し、その結果で出力する文章を変えること。

num が 2で割り切れる値であり、resultがtrueの場合
num ÷ 2 = 0 です。 (true = 1) と出力する

num が 2で割り切れる値であり、resultがfalseの場合
num ÷ 2 = 0 だと思います。 (false = 0) と出力する

num が 5で割り切れる値であり、resultがtrueの場合
num ÷ 5 = 0 です。 (true = 1) と出力する

num が 5で割り切れる値であり、resultがfalseの場合
num ÷ 5 = 0 だと思います。 (false = 0) と出力する

上記のどれにも当てはまらない場合
num は未知の数値です。"

また条件関係なく
-------------------------------------- と出力する(ハイフンの数問わない)

#hint

```java
import java.util.Random; // ランダムを扱うためのプラグインをこのプログラムに読み込む

public class test {

	public static void main(String[] args) {
		int num;
		for (?) {
			Random random = new Random(); //　おまじない
			boolean result = random.nextBoolean(); // True or False のどちらかを変数 resultにプログラムが自動で代入する
			
			...(ry
		}	
	}
}