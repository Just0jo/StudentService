package ie.atu.studentsevice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "student-service", url = "http:/localhost:8082")
public interface ProductClient {
    @PostMapping("ProductGet")
    String studentDetails(@RequestBody Product product);


}
