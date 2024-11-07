package hospital_management_system;

//**********************************************
//Description: Single Responsibility Principle (SRP) for storing patient's details 
//             like patientId, patient's name, age, address and medicalHistory.
//**********************************************


/**
 * Class for storing patient details
 * like patientId, name, age, address, medical history.
 */
public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String address;
    private String medicalHistory;

    // Getters and Setters for accessing and updating values
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}
