package hospital_management_system;

//************************************************
//Description: Dependency Inversion Principle (DIP) for managing Appointments.
//************************************************

/**
 * AppointmentManagement class implements IAppointmentManagement
 * interface for managing the Appointments.
 */
public class AppointmentManagement implements IAppointmentManagement {
    @Override
    /**
     * 
     * @param appointment
     */
    public void AddNewAppointment(Appointment appointment) {
        // Implementation code
    }

    @Override
    /**
     * 
     * @param appointmentId
     */
    public void cancelAppointment(int appointmentId) {
        // Implementation code
    }

    @Override
    /**
     * 
     * @param appointment
     */
    public void updateAppointment(Appointment appointment) {
        // Implementation code
    }

    @Override
    /**
     * 
     * @param appointmentId
     */
    public void showAppointmentDetails(int appointmentId) {
        // Implementation code
    }
}
