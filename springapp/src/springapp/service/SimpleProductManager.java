package springapp.service;

import java.util.List;

import springapp.dao.CustomerDao;
import springapp.domain.Product;

public class SimpleProductManager implements ProductManager {


    private List<Product> products;
    
    private CustomerDao dao; 
    
    public CustomerDao getDao() {
		return dao;
	}

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void increasePrice(int percentage) {
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * 
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }
    }
    

	public String getCustomerName() {
		return dao.getCustomerName();
	}
    
}