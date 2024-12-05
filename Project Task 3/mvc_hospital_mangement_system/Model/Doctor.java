package mvc_hospital_mangement_system.Model;

public class Doctor extends Staff {
    private String specialization;
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
