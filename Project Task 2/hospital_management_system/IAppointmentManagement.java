package hospital_management_system;

//*************************************************
//Description: Interface segrigation Principle (ISP).
//             Interface for appoinment management like adding or canceling appoinments,
//             updating and showing appoinment's details.
//*************************************************

public interface IAppointmentManagement {
    /**
     * 
     * @param appointment
     */
    void AddNewAppointment(Appointment appointment);

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
     */
    void showAppointmentDetails(int appointmentId);
}
