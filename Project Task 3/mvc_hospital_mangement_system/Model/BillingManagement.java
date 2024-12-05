package mvc_hospital_mangement_system.Model;

public class BillingManagement implements IBillingManagement {
    @Override
    public void generateBill(Billing billing) {
        // Implementation code
    }

    @Override
    public void processPayment(int billId, double amount) {
        // Implementation code
    }

    @Override
    public Billing getBillingDetails(int patientId) {
        // Implementation code
        return new Billing(); // Placeholder return
    }
}
