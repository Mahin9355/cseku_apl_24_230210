package mvc_hospital_mangement_system.Model;

public interface IBillingManagement {
    /**
     * 
     * @param billing
     */
    void generateBill(Billing billing);

    /**
     * 
     * @param billId
     * @param amount
     */
    void processPayment(int billId, double amount);

    /**
     * 
     * @param patientId
     * @return
     */
    Billing getBillingDetails(int patientId);
}
