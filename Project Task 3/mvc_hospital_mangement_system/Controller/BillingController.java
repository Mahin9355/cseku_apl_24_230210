package mvc_hospital_mangement_system.Controller;

import mvc_hospital_mangement_system.Model.*;

import mvc_hospital_mangement_system.View.*;

public class BillingController {
    private IBillingManagement model;
    private BillingView view;

    /**
     * 
     * @param model
     * @param view
     */
    public BillingController(IBillingManagement model, BillingView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * 
     * @param billing
     */
    public void generateBill(Billing billing) {
        model.generateBill(billing);
    }

    /**
     * 
     * @param billId
     * @param amount
     */
    public void processPayment(int billId, double amount) {
        model.processPayment(billId, amount);
    }

    /**
     * 
     * @param patientId
     */
    public void displayBillingDetails(int patientId) {
        Billing billing = model.getBillingDetails(patientId);
        view.displayBillingDetails(billing);
    }
}
