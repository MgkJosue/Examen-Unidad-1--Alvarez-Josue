package patient.patient.dto;



import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class NewPatientDTO {
    @NotNull(message = "Name can't be null.")    
    private String name;
        
    private double height;
    
    private double weight;

    @NotNull(message = "Join Date can't be null.")   
    private LocalDate joinDate;
   
    
    private short age;
}
