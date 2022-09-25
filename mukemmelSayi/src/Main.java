
public class Main {

	public static void main(String[] args) {
		// 6 ----1,2,3 bölünür toplamlarıda 6 dır.

		int number=28;
		int total=0;

		
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					total = total + i;
					//System.out.println(number + " " + i + " " + total);

					

				}

			}
			if (total == number) {
				System.out.println(number + " Mükemmel sayı");

			}else {
				System.out.println(number + " Mükemmel sayı degil");
			}
		}
		

	}


