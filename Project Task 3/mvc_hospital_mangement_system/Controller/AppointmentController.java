package mvc_hospital_mangement_system.Controller;

import mvc_hospital_mangement_system.Model.*;

import mvc_hospital_mangement_system.View.*;

public class AppointmentController {
    private IAppointmentManagement model;
    private AppointmentView view;

    /**
     * 
     * @param model
     * @param view
     */
    public AppointmentController(IAppointmentManagement model, AppointmentView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * 
     * @param appointment
     */
    public void scheduleAppointment(Appointment appointment) {
        model.scheduleAppointment(appointment);
    }

    /**
     * 
     * @param appointment
     */
    public void updateAppointment(Appointment appointment) {
        model.updateAppointment(appointment);
    }

    /**
     * 
     * @param appointmentId
     */
    public void displayAppointmentDetails(int appointmentId) {
        Appointment appointment = model.getAppointmentDetails(appointmentId);
        view.displayAppointmentDetails(appointment);
    }
}
