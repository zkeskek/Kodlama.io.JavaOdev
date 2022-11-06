package springIntro;

public class MsSqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Ms Sql veri tabanına eklendi");
		
	}

}
