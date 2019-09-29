package Solid.S;

public class SmsManager implements IManager {
    public String address;
    public String Content;

    public SmsManager(String address, String content) {
        this.address = address;
        Content = content;
    }

    @Override
    public boolean send(){
        return true;
    }
}
