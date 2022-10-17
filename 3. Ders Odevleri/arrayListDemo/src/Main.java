import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
//		int[] sayilar=new int[] {1,2,3};
//		sayilar= new int[4];
//		System.out.println(sayilar[0]);// 0 olur yeni bir dizi oluşturuldu

		ArrayList sayilar=new ArrayList();// Arraylist paketi eklendi
		sayilar.add(1);
		System.out.println(sayilar.size());
		sayilar.add(10);
		sayilar.add("Ankara");
		System.out.println(sayilar.size());
		
		System.out.println("-------");
		System.out.println(sayilar.get(0));	
		System.out.println(sayilar.get(1));
		System.out.println(sayilar.get(2));
		
	
		sayilar.set(0,19);
		sayilar.set(1,21);
		sayilar.set(2,100);
		System.out.println("-------");
		System.out.println(sayilar.get(0));
		System.out.println(sayilar.get(1));
		System.out.println(sayilar.get(2));
		
		sayilar.remove(0);
		
		System.out.println("-------");
		System.out.println(sayilar.get(0));
		System.out.println(sayilar.get(1));
		//System.out.println(sayilar.get(2)); yok
		
		//sayilar.clear();//tüm index silinir
		System.out.println("-------");
		//System.out.println(sayilar.get(0)); hepsi silindi
		//System.out.println(sayilar.get(1));
		
		for(Object i:sayilar) {
			System.out.println(i);
		}
	}

}
