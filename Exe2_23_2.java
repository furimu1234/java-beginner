import java.util.Calendar;
import java.util.Scanner;

public class Exe2_23_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Calendar cal = set_calendar();


		int beforeBlank = cal.get(Calendar.DAY_OF_WEEK)-1;
		int daysCount = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		ouput_day_of_week();

		System.out.println();

		for(int i=0;i<beforeBlank+daysCount;i++) {

			String str="";

			if(i>=beforeBlank) {

				int date=i+1-beforeBlank;
				str=String.valueOf(date);
			}

			System.out.printf("%4s", str);

			if((i+1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	private static int input_month() {
		int month;
		Scanner scan = new Scanner(System.in);

		System.out.println("カレンダーを見たい月を入力してね。");

		month = scan.nextInt() - 1;
		scan.close();

		return month;

	}

	private static Calendar set_calendar() {
		int month = input_month();
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, month);

		cal.set(Calendar.DATE, 1);

		return cal;
	}

	private static void ouput_day_of_week() {
		String[] weeks= {"日","月","火","水","木","金","土"};

		for(String week:weeks) {
			System.out.printf("%3s",week);
		}

		System.out.println();
	}

}