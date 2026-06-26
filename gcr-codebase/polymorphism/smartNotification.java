class Notification {
    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending Notification...");
    }
}

class EmailNotification extends Notification {

    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email Notification");
        System.out.println("Recipient: " + recipientName);
        System.out.println("Message: " + message);
        System.out.println("-------------------------");
    }
}

class SMSNotification extends Notification {

    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS Notification");
        System.out.println("Recipient: " + recipientName);
        System.out.println("Message: " + message);
        System.out.println("-------------------------");
    }
}

class PushNotification extends Notification {

    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push Notification");
        System.out.println("Recipient: " + recipientName);
        System.out.println("Message: " + message);
        System.out.println("-------------------------");
    }
}

public class smartNotification {
    public static void main(String[] args) {

        Notification[] notifications = {
            new EmailNotification("Sona", "Your order has been shipped."),
            new SMSNotification("Rahul", "Your OTP is 456789."),
            new PushNotification("Priya", "You have a new friend request."),
            new EmailNotification("Amit", "Meeting at 10 AM tomorrow.")
        };

        System.out.println("Sending All Notifications...\n");

        for (Notification n : notifications) {
            n.sendNotification();   // Dynamic Method Dispatch
        }
    }
}