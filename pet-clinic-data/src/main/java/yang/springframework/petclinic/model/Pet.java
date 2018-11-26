package yang.springframework.petclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

//Exclude Circular dependency
@EqualsAndHashCode(exclude = "owner", callSuper = true)
@Data
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "name")
    private String name;
}
