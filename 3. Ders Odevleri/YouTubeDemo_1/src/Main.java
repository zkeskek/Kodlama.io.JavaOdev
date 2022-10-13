import java.lang.reflect.Constructor;

import javax.management.ConstructorParameters;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();

		CustomerManager customerManager1 = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager1.GiveCredit();

		CustomerManager customerManager2 = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager2.GiveCredit();

	}
}

interface ICreditManager {
	void Calculate();

	void Save();
}

abstract class BaseCreditManager implements ICreditManager {

	@Override
	public abstract void Calculate();

	@Override
	public void Save() {

		System.out.println("Kaydedildi");
	}

}

class TeacherCreditManager extends BaseCreditManager {
	public void Calculate() {
		//

		System.out.println("Öğretmen Kredisi Hesaplandı");
	}

}

class MilitaryCreditManager extends BaseCreditManager {

	@Override
	public void Calculate() {
		System.out.println("Asker Kredisi Hesaplandı");

	}

	@Override
	public void Save() {

		System.out.println("Aktarıldı");
	}

}

class CarCreditManager extends BaseCreditManager {

	@Override
	public void Calculate() {
		System.out.println("Araba Kredisi Hesaplandı");

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
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}

	public void save() {
		System.out.println("Müsteri kaydedildi:");
	}

	public void delete() {
		System.out.println("Müsteri Silindi:");

	}

	public void GiveCredit() {
		_creditManager.Calculate();
		_creditManager.Save();
	}

}
