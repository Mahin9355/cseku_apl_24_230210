package mvc_hospital_mangement_system.Model;

public class Nurse extends Staff {
    private String shiftTime;
    private String wardName;

    // Getters and Setters
    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }
}
