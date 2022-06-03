package patient.patient.services;

import java.util.List;

import patient.patient.dto.NewPatientDTO;
import patient.patient.dto.PatientDTO;

public interface PatientService {
    public PatientDTO create(NewPatientDTO patientDTO);
    public PatientDTO retrieve(Long id);
    public List<PatientDTO> list();
}
