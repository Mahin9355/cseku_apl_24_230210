package hospital_management_system;

//**********************************************
//Description: Single Responsibility Principle (SRP) for storing the informations of a staff. 
//             like staffId, staff's name and contactDetails.
//**********************************************


/**
 * Class for storing staff details
 * like staffId, name, age, address, medical history.
 */
public class Staff {
    private int staffId;
    private String name;
    private String contactDetails;

    // Getters and Setters
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }
}
