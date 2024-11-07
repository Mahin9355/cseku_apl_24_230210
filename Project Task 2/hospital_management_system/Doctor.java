package hospital_management_system;

//**********************************************
// Descrition : Liskov Substitution Principle (LSP) for specific doctor staffs,
//              extending the general Staff class
//              to provide detailed information for Doctors
//***********************************************

/**
 * Represents the Doctor Staffs extended from Staff
 */

public class Doctor extends Staff {
    //specify the sector of specialization of the the doctor
    private String specialization;

    //information about when the doctor is available
    private String availableSchedule;

    // Getters and Setters
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAvailableSchedule() {
        return availableSchedule;
    }

    public void setAvailableSchedule(String availableSchedule) {
        this.availableSchedule = availableSchedule;
    }
}
