package yang.springframework.petclinic.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

//Exclude Circular dependency
@EqualsAndHashCode(exclude = "pets", callSuper = true)
@Data
public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets = new HashSet<>();
}
