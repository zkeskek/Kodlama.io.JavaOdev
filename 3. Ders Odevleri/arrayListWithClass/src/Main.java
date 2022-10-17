import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

ArrayList<Customer> customers=new ArrayList<Customer>();
Customer engin=new Customer(1,"Engin","Demiroğ");

//customers.add(new Customer(1,"Engin","Demiroğ"));
customers.add(new Customer(2,"Derin","Demiroğ"));
customers.add(new Customer(1,"Salih","Demiroğ"));
//customers.remove(1); // 1. indeksi siler
//customers.remove(new Customer(1,"Salih","Demiroğ"));// silme yapmaz
customers.remove(engin);//engin bir referans tututuğu için silinir
for (Customer customer:customers) {
	System.out.println(customer.firstName);
}
	}

}
