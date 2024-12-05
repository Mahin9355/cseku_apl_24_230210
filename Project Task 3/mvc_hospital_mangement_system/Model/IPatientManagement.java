package mvc_hospital_mangement_system.Model;

public interface IPatientManagement {
    /**
     * 
     * @param patient
     */
    void addPatient(Patient patient);

    /**
     * 
     * @param patientId
     */
    void removePatient(int patientId);

    /**
     * 
     * @param patient
     */
    void updatePatientDetails(Patient patient);

    /**
     * 
     * @param patientId
     * @return
     */
    Patient getPatientDetails(int patientId);
}
