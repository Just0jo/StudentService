package ie.atu.studentsevice;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class Controller {
    private final ProductService productService;
    private ProductClient productClient;
    @Autowired
    public Controller(ProductService productService, ProductClient productClient){
        this.productService = productService;
        this.productClient = productClient;
    }
    @PostMapping("/ProductPost")
    public String addProduct(@RequestBody @Valid Product product){
        String productGet = ProductClient.studentDetails(product);
        return productGet;
    }
}
