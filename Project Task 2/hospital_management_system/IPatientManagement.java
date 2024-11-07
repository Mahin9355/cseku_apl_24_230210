package hospital_management_system;

//*************************************************
//Description: Interface segrigation Principle (ISP).
//             Interface for patient management like adding or
//             removing patients, updating and showing patient's details.
//*************************************************

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
     */
    void showPatientDetails(int patientId);
}
