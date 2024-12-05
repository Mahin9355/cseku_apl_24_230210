package mvc_hospital_mangement_system.Main;

import mvc_hospital_mangement_system.Controller.*;
import mvc_hospital_mangement_system.Model.*;
import mvc_hospital_mangement_system.View.*;

public class Main {
    public static void main(String[] args) {
        // Initialize models
        IPatientManagement patientModel = new PatientManagement();
        IStaffManagement staffModel = new StaffManagement();
        IAppointmentManagement appointmentModel = new AppointmentManagement();
        IBillingManagement billingModel = new BillingManagement();

        // Initialize views
        PatientView patientView = new PatientView();
        StaffView staffView = new StaffView();
        AppointmentView appointmentView = new AppointmentView();
        BillingView billingView = new BillingView();

        // Initialize controllers
        PatientController patientController = new PatientController(patientModel, patientView);
        StaffController staffController = new StaffController(staffModel, staffView);
        AppointmentController appointmentController = new AppointmentController(appointmentModel, appointmentView);
        BillingController billingController = new BillingController(billingModel, billingView);

        // Example operations
        // Adding a new patient
        Patient newPatient = new Patient();
        newPatient.setPatientId(1);
        newPatient.setName("A");
        newPatient.setAge(30);
        newPatient.setAddress("Khulna");
        newPatient.setMedicalHistory("unknown");
        patientController.addPatient(newPatient);

        // Displaying patient details
        patientController.displayPatientDetails(1);

        // Adding a new doctor
        Doctor newDoctor = new Doctor();
        newDoctor.setName("Dr. Mahin");
        newDoctor.setContactDetails("018xxxxxxxx");
        newDoctor.setSpecialization("Cardiologist");
        newDoctor.setAvailableSchedule("Mon-Fri 9am-5pm");
        staffController.addStaff(newDoctor);

        // Displaying doctor details
        staffController.displayStaffDetails(1);

        // Scheduling an appointment
        Appointment newAppointment = new Appointment();
        newAppointment.setAppointmentId(1);
        newAppointment.setPatientId(1);
        newAppointment.setAppointmentDate("2024-12-05 10:00");
        newAppointment.setStatus("Scheduled");
        appointmentController.scheduleAppointment(newAppointment);

        // Displaying appointment details
        appointmentController.displayAppointmentDetails(1);

        // Generating a bill
        Billing newBilling = new Billing();
        newBilling.setBillId(1);
        newBilling.setPatientId(1);
        newBilling.setAmount(500.00);
        newBilling.setPaymentStatus("Unpaid");
        billingController.generateBill(newBilling);

        // Displaying billing details
        billingController.displayBillingDetails(1);

        // Processing payment
        billingController.processPayment(1, 500.00);

        // Displaying updated billing details
        billingController.displayBillingDetails(1);
    }
}
