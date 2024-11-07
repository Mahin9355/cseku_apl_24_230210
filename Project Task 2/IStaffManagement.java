package hospital_management_system;

//*************************************************
//Description: Interface segrigation Principle (ISP).
//             Interface for staff management like adding or removing staffs,
//             updating and showing staff's details.
//*************************************************

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
     */
    void showStaffDetails(int staffId);
}
