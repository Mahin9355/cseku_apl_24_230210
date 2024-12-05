package mvc_hospital_mangement_system.Controller;

import mvc_hospital_mangement_system.Model.*;

import mvc_hospital_mangement_system.View.*;

public class PatientController {
    private IPatientManagement model;
    private PatientView view;

    /**
     * 
     * @param patientModel
     * @param view
     */
    public PatientController(IPatientManagement patientModel, PatientView view) {
        this.model = patientModel;
        this.view = view;
    }

    /**
     * 
     * @param patient
     */
    public void addPatient(Patient patient) {
        model.addPatient(patient);
    }

    /**
     * 
     * @param patient
     */
    public void updatePatientDetails(Patient patient) {
        model.updatePatientDetails(patient);
    }

    /**
     * 
     * @param patientId
     */
    public void displayPatientDetails(int patientId) {
        Patient patient = model.getPatientDetails(patientId);
        view.displayPatientDetails(patient);
    }
}
