package com.mtit.it18062502.invoiceservice.objects;

public class InvoiceRequest {

    private int totalAmount;
    private String customerName;
    private String invoiceDate;
    private String paymentStatus;

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "InvoiceRequest{" +
                "totalAmount=" + totalAmount +
                ", customerName='" + customerName + '\'' +
                ", invoiceDate='" + invoiceDate + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
