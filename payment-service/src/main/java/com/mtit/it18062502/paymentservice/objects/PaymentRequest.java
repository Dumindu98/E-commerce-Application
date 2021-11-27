package com.mtit.it18062502.paymentservice.objects;


public class PaymentRequest {

    private String customerName;
    private String email;
    private int amount;
    private String paymentMethod;
    private String cardNo;
    private String exDate;
    private String cvcNo;
    private String paymentNote;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getExDate() {
        return exDate;
    }

    public void setExDate(String exDate) {
        this.exDate = exDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPaymentNote() {
        return paymentNote;
    }

    public void setPaymentNote(String paymentNote) {
        this.paymentNote = paymentNote;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCvcNo() {
        return cvcNo;
    }

    public void setCvcNo(String cvcNo) {
        this.cvcNo = cvcNo;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", exDate='" + exDate + '\'' +
                ", cvcNo='" + cvcNo + '\'' +
                ", paymentNote='" + paymentNote + '\'' +
                '}';
    }
}
