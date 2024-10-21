package ie.atu.studentsevice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    private long studentId;

    private String firstName;

    private String lastName;

    private String email;

    private long dateOfBirth;

}
