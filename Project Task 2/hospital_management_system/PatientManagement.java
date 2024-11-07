package hospital_management_system;

//************************************************
//Description: Dependency Inversion Principle (DIP) for managing patients.
//************************************************

/**
 * PatientManagement class implements IPatientManagement interface
 * for managing the patients.
 */
public class PatientManagement implements IPatientManagement {
    @Override
    /**
     * To add patient
     * @param patient
     */
    public void addPatient(Patient patient) {
        // Implementation code
    }

    @Override
    /**
     * To remove patient
     * @param patientid
     *
     */
    public void removePatient(int patientId) {
        // Implementation code
    }

    @Override
    /**
     * To update patient details
     * @param patient
     */
    public void updatePatientDetails(Patient patient) {
        // Implementation code
    }

    @Override
    /**
     * To show patient's details
     * @param patientId
     */
    public void showPatientDetails(int patientId) {
        // Implementation code
    }
}
