
public class Main1 {

	public static void main1(String[] args) {
		// 6 ----1,2,3 bölünür toplamlarıda 6 dır.

		int number;
		int total;

		for (number = 2; number < 100; number++) {
			total = 0;
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					total = total + i;
					//System.out.println(number + " " + i + " " + total);

					if (total == number) {
						System.out.println(number + " Mükemmel sayı");

					}

				}

			}
		}
		

	}

}
