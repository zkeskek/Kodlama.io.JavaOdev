
public class Main {

	public static void main(String[] args) {
		int[] sayilar1 = { 1, 2, 3 };
		int[] sayilar2 = { 10, 20, 30 };
		sayilar1=sayilar2;
		sayilar2[0]=1000;
		
		System.out.println("sayilar1[0] = "+sayilar1[0]);
			System.out.println("sayilar1 = "+sayilar1[0]+" "+sayilar1[1]+" "+sayilar1[2]+" ");
			System.out.println("sayilar2 = "+sayilar2[0]+" "+sayilar2[1]+" "+sayilar2[2]+" ");
				
	}

}
