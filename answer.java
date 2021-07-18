public class answer { // いつもの
	public static void main(String[] args) { // いつもの
		int[] tensu = {80, 63, 70, 45, 90, 100};

		int a, i;
		for (int n: tensu) {
			a=n/20;
			System.out.println(a);
		}

		System.out.println("----------------");

		for (i=0; i<tensu.length; i++){
			a = tensu[i]/20;
			System.out.println(a);
		}
		System.out.println("----------------");

		for (i=0; i<tensu.length; i++){
			int n=tensu[i];
			a=n/20;
		}
		System.out.println("----------------");


	

	}

}
