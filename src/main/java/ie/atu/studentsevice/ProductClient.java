package ie.atu.studentsevice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "student-service", url = "http:/localhost:8082")
public interface ProductClient {


}
