package hospital_management_system;

//**********************************************
//Description: Single Responsibility Principle (SRP) for storing 
//             Appointment's details like appointmentId,
//             patientId for the appointment, appointment date and appointment status.
//***********************************************

/**
 * Class for storing Appointment details
 */
public class Appointment {
    private int appointmentId;
    private int patientId;
    private String appointmentDate;
    private String status;

    // Getters and Setters
    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
