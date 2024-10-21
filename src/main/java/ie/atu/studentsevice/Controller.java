package ie.atu.studentsevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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









}
