package LearnJava.Oops;

/*
Create a Notification class with a method sendNotification(). 
Implement subclasses EmailNotification, SMSNotification, and PushNotification, 
overriding the method to provide specific notification mechanisms. 
Demonstrate dynamic polymorphism by invoking the method on various objects.
*/

public abstract class Notification {
    public abstract void sendNotification(String message);
}

class EmailNotification extends Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification : " +message);
    }
}

class SMSNotification extends Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification : " +message);
    }
}

class PushNotification extends Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Push Notification : " +message);
    }
}

class NotificationSystem {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.sendNotification("Hi, How are you !");
    }
}