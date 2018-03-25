package fgcu.hackabull.DataObjects;

/**
 * Created by jeffr on 3/25/2018.
 */

public class Payment {
    private String clientName;
    private String handymanName;
    private String date;
    private String amount;
    public Payment(String clientName, String handymanName, String date, String amount){
        this.clientName = clientName;
        this.handymanName = handymanName;
        this.date = date;
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHandymanName() {
        return handymanName;
    }

    public void setHandymanName(String handymanName) {
        this.handymanName = handymanName;
    }
}
