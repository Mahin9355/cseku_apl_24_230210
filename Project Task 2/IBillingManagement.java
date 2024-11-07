package hospital_management_system;

//*************************************************
//Description: Interface segrigation Principle (ISP).
//             Interface for bill management like generating new bill,
//             processing payments and showing billing details.
//*************************************************

public interface IBillingManagement {
    /**
     * 
     * @param billing
     */
    void generateNewBill(Billing billing);

    /**
     * 
     * @param billId
     * @param amount
     */
    void processPayment(int billId, double amount);

    /**
     * 
     * @param patientId
     */
    void showBillingDetails(int patientId);
}
