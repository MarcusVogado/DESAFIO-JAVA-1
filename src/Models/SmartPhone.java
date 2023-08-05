package Models;

public class SmartPhone {
    protected String model;
    protected int phoneNumber;
    protected int imei;

    public SmartPhone(String model, int phoneNumber, int imei) {
        this.model = model;
        this.phoneNumber = phoneNumber;
        this.imei = imei;
    }

}