package ie.atu.studentsevice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> productList = new ArrayList<>();

    public List<Product> getAllProduct() {
        return productList;
    }
    public String addProduct(Product product){
        productList.add(product);
        return "product listed";
    }
}
