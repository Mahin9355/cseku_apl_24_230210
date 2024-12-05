package mvc_hospital_mangement_system.Controller;

import mvc_hospital_mangement_system.Model.*;

import mvc_hospital_mangement_system.View.*;

public class StaffController {
    private IStaffManagement model;
    private StaffView view;

    /**
     * 
     * @param model
     * @param view
     */
    public StaffController(IStaffManagement model, StaffView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * 
     * @param staff
     */
    public void addStaff(Staff staff) {
        model.addStaff(staff);
    }

    /**
     * 
     * @param staff
     */
    public void updateStaffDetails(Staff staff) {
        model.updateStaffDetails(staff);
    }

    /**
     * 
     * @param staffId
     */
    public void displayStaffDetails(int staffId) {
        Staff staff = model.getStaffDetails(staffId);
        view.displayStaffDetails(staff);
    }
}
