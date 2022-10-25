import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		 MyList<Customer> sehirler=new MyList<>(); 
		 sehirler.add(new Customer());
		 sehirler.add(new Customer()); 
		 
		 /* //sehirler.add(1); //geçersiz tip
		 */
		
		/*
		 * MyList<String> sehirler=new MyList<>(); sehirler.add("Ankara");
		 * sehirler.add("İstanbul"); 
		 * sehirler.add("İzmir"); 
		 * //sehirler.add(1); //geçersiz tip
		 */
		
		/*
		 * ArrayList<String> sehirler=new ArrayList<String>(); 
		 * sehirler.add("Ankara");
		 * sehirler.add("İstanbul"); 
		 * sehirler.add("İzmir");
		 */

	}

}
