package hospital_management_system;

//************************************************
//Description: Dependency Inversion Principle (DIP) for managing Bills.
//************************************************

/**
 * BillingManagement class implements IBillingManagement interface
 * for managing the Bills.
 */
public class BillingManagement implements IBillingManagement {
    @Override
    /**
     * 
     * @param billing
     */
    public void generateNewBill(Billing billing) {
        // Implementation code
    }

    @Override
    /**
     * 
     * @param billId
     * @param amount
     */
    public void processPayment(int billId, double amount) {
        // Implementation code
    }

    @Override
    /**
     * 
     * @param patientId
     */
    public void showBillingDetails(int patientId) {
        // Implementation code
    }
}
