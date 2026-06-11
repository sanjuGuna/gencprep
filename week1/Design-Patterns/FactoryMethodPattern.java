//Factory Method Pattern
interface Notification{//common interface for clients to 
    void send();
}
class EmailNotification implements Notification{
    public void send(){
        System.out.println("Sending email");
    }
}
class SMSNotification implements Notification{
    public void send(){
        System.out.println("Sending SMS");
    }
}

class NotificationFactory{//Factory
    public static Notification createNotification(String type){
        if(type.equals("SMS")){
            return new SMSNotification();
        }
        if(type.equals("Email")){
            return new EmailNotification();
        }
        return null;
    }
}
public class FactoryMethodPattern{//client code
    public static void main(String[] args) {
        Notification n=NotificationFactory.createNotification("Email");
        n.send();
    }
}
