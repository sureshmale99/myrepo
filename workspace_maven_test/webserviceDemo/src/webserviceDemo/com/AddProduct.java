package webserviceDemo.com;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class AddProduct {
	
	ProductServiceImpl service = new ProductServiceImpl();
	
	@WebMethod
	public boolean addProduct(String productName) {
		return service.addProduct(productName);
	}

}
