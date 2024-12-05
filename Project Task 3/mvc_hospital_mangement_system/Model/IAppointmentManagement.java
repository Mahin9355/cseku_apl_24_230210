package mvc_hospital_mangement_system.Model;

public interface IAppointmentManagement {
    /**
     * 
     * @param appointment
     */
    void scheduleAppointment(Appointment appointment);

    /**
     * 
     * @param appointmentId
     */
    void cancelAppointment(int appointmentId);

    /**
     * 
     * @param appointment
     */
    void updateAppointment(Appointment appointment);

    /**
     * 
     * @param appointmentId
     * @return
     */
    Appointment getAppointmentDetails(int appointmentId);
}
