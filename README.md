# Hospital Management System

The Hospital Management System is designed to manage the operations of a hospital, including patient management, staff management, appointment scheduling, and billing. This system aims to streamline administrative tasks and improve the efficiency of hospital operations.

---

## Features

- **Patient Management**: Add, remove, update, and retrieve patient details.
- **Staff Management**: Add, remove, update, and retrieve staff details, including doctors and nurses.
- **Appointment Management**: Schedule, cancel, update, and retrieve appointment details.
- **Billing Management**: Generate bills, process payments, and retrieve billing details.

---

## Project Structure

hospital-management-system/
- │
- ├── src/
- │   ├── IPatientManagement.java
- │   ├── IStaffManagement.java
- │   ├── IAppointmentManagement.java
- │   ├── IBillingManagement.java
- │   ├── Patient.java
- │   ├── Staff.java
- │   ├── Doctor.java
- │   ├── Nurse.java
- │   ├── Appointment.java
- │   ├── Billing.java
- │   ├── PatientManagement.java
- │   ├── StaffManagement.java
- │   ├── AppointmentManagement.java
- │   ├── BillingManagement.java
- │   └── Main.java
- │
- ├── README.md
- └── .gitignore


---

## System Design

### Interfaces

- **IPatientManagement**
  - `addPatient(Patient patient)`
  - `removePatient(int patientId)`
  - `updatePatientDetails(Patient patient)`
  - `getPatientDetails(int patientId)`

- **IStaffManagement**
  - `addStaff(Staff staff)`
  - `removeStaff(int staffId)`
  - `updateStaffDetails(Staff staff)`
  - `getStaffDetails(int staffId)`

- **IAppointmentManagement**
  - `scheduleAppointment(Appointment appointment)`
  - `cancelAppointment(int appointmentId)`
  - `updateAppointment(Appointment appointment)`
  - `getAppointmentDetails(int appointmentId)`

- **IBillingManagement**
  - `generateBill(Billing billing)`
  - `processPayment(int billId, double amount)`
  - `getBillingDetails(int patientId)`

### Classes

- **Patient**
  - **Attributes**: `patientId`, `name`, `age`, `address`, `medicalHistory`
  - **Methods**: `getPatientDetails()`, `updatePatientDetails()`

- **Staff**
  - **Attributes**: `staffId`, `name`, `role`, `department`, `contactDetails`
  - **Methods**: `getStaffDetails()`, `updateStaffDetails()`

- **Doctor** (inherits from Staff)
  - **Attributes**: `specialization`, `availableSlots`
  - **Methods**: `getDoctorDetails()`, `updateDoctorDetails()`

- **Nurse** (inherits from Staff)
  - **Attributes**: `shiftTiming`, `assignedWard`
  - **Methods**: `getNurseDetails()`, `updateNurseDetails()`

- **Appointment**
  - **Attributes**: `appointmentId`, `patientId`, `doctorId`, `appointmentDate`, `status`
  - **Methods**: `scheduleAppointment()`, `cancelAppointment()`, `updateAppointment()`, `getAppointmentDetails()`

- **Billing**
  - **Attributes**: `billId`, `patientId`, `amount`, `paymentStatus`
  - **Methods**: `generateBill()`, `processPayment()`, `getBillingDetails()`

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/hospital-management-system.git
