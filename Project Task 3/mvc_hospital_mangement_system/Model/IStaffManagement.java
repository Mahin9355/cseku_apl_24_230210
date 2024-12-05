package mvc_hospital_mangement_system.Model;

public interface IStaffManagement {
    /**
     * 
     * @param staff
     */
    void addStaff(Staff staff);

    /**
     * 
     * @param staffId
     */
    void removeStaff(int staffId);

    /**
     * 
     * @param staff
     */
    void updateStaffDetails(Staff staff);

    /**
     * 
     * @param staffId
     * @return
     */
    Staff getStaffDetails(int staffId);
}
