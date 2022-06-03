package patient.patient.models;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//Examen -Alvarez Josue
@Entity
@Table(name="TBL_PATIENTS")
@Getter
@Setter
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "NAME")    
    private String name;
    @Column(name = "HEIGHT")    
    private double height;
    @Column(name = "WEIGHT")    
    private double weight;
    @Column(name = "JOIN_DATE")    
    private LocalDate joinDate;
    @Column(name = "AGE")    
    private short age;
}
