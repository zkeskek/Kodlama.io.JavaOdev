import java.lang.reflect.Constructor;

import javax.management.ConstructorParameters;

public class Main {

	public static void main(String[] args) {

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer();
		customer.id = 1;
		customer.city = "Ankara";

		Company company = new Company();
		company.taxNumber = "10000";
		company.companyName = "Arçelik";
		company.id = 100;
		
		CustomerManager customerManager1=new CustomerManager(new Customer());
		CustomerManager customerManager2=new CustomerManager(new Company());
		CustomerManager customerManager3=new CustomerManager(new Person());
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();

		Person person = new Person();
		person.firstName = "Engin";
		person.nationalIdentity = "2314";

		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save();
		customerManager.delete();



	}

	
}

class CreditManager {

	public void calculate() {
		//

		System.out.println("Hesaplandı");
	}

	public void save() {
		//

		System.out.println("Kredi verildi");
	}

}

class Customer {

	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı");

	}

	public int id;
	public String city;
}

class Company extends Customer {
	public String companyName;
	public String taxNumber;
}

class Person extends Customer {
	public String firstName;
	public String lastName;
	public String nationalIdentity;
}

class CustomerManager {
	private Customer _customer;

	public CustomerManager(Customer customer) {
		_customer=customer;

	}

	public void save() {
		System.out.println("Müsteri kaydedildi:"+_customer.city);
	}
	public void delete() {
		System.out.println("Müsteri Silindi:"+_customer.city);
	}
}