package hospital_management_system;

//**********************************************
//Description: Single Responsibility Principle (SRP) for storing bill's details 
//             like billId, patientId for the bill,
//             the amount of the bill and the paymentStatus.
//**********************************************


/**
 * Class for storing bill details like billId, name, age, address, medical history.
 */
public class Billing {
    private int billId;
    private int patientId;
    private double amount;
    private String paymentStatus;

    // Getters and Setters
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
