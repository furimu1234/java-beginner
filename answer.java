public class answer { // いつもの
	public static void main(String[] args) { // いつもの

		int[][] numbers = {{1, 2}, {3, 4}, {5, 6}}; //numbers変数という配列を作り、その中に3つ配列を作る (2次元配列)

		for (int one=0; numbers.length > one; one++) {
			for (int two=0; numbers[one].length  > two; two++) {

				System.out.println("番号: " + numbers[one][two]);
			}
		}

	}

}
