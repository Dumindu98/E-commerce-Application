package com.mtit.it18062502.paymentservice.objects;

public class PaymentResponse {

    private String Paymentid;
    private String message;
    private String invoiceId;

    public String getPaymentid() {
        return Paymentid;
    }

    public void setPaymentid(String paymentid) {
        Paymentid = paymentid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
}
