
public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus laptop",3000,2,"siyah");

		/*
		 * product.name="Laptop"; product.id =1; product.description ="Asus Laptop";
		 * product.price =5000; product.stockAmount =3;
		 */
		/*product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount ( 3);
		*/
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());

	}

}
