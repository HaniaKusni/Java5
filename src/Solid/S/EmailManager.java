package Solid.S;

public class EmailManager implements IManager{
    public String address;
    public String subject;
    public String Content;

    public EmailManager(String address, String subject, String content) {
        this.address = address;
        this.subject = subject;
        Content = content;
    }

    @Override
    public boolean send() {
        return false;
    }
}
