package oopWithNLayeredApp.business;

import java.util.List;


import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;

	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {

		this.productDao = productDao;
		this.loggers=loggers;
	}

	public void add(Product product) throws Exception {
		// İş kuraları yazılacak
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyat 10 dan aşağı olamaz");
		}
		// ProductDao productDao= new ProductDao();
		productDao.add(product);
		
		for(Logger logger:loggers) {
			logger.log(product.getName());
		}

	}
}
