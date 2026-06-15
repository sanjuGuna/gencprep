//Factory Method Pattern
interface Notification{//common interface for clients
    void send();
}
class EmailNotification implements Notification{//food
    public void send(){
        System.out.println("Sending email");
    }
}
class SMSNotification implements Notification{
    public void send(){
        System.out.println("Sending SMS");
    }
}

abstract class NotificationFactory{//Factory(server)
    abstract Notification createNotification();
}

class SMSFactory extends NotificationFactory{//cheff like preparing food
    public Notification createNotification(){
        return new SMSNotification();
    }
}

class EmailFactory extends NotificationFactory{
    public Notification createNotification(){
        return new EmailNotification();
    }
}
public class FactoryMethodPattern{//client code
    public static void main(String[] args) {
        NotificationFactory factory=new EmailFactory();
        Notification n= factory.createNotification();
        n.send();
    }
}
