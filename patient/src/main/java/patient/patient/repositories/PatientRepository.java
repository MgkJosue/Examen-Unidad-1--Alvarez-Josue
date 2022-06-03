package patient.patient.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import patient.patient.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    
}
