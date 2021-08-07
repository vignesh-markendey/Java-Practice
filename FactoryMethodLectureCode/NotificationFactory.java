package HomePractice.FactoryMethodLectureCode;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NotificationFactory {

    public Notification createNotification(String msg, String c) {

        String channel = c;
        //if notification type is not defined, randomly choose one
        //Another Example: if it was a game, we could balance the number of enemies
        // or depending on the difficulty level, create different enemies, etc.

        if (channel == null || channel.isEmpty()) {
            List<String> l = Arrays.asList("SMS", "EMAIL", "PUSH");
            Random rand = new Random();
            channel = l.get(rand.nextInt(l.size()));
        }
        if ("SMS".equalsIgnoreCase(channel)) {
            return new SMSNotification();
        } else if ("EMAIL".equalsIgnoreCase(channel)) {
            return new EmailNotification();
        } else if ("PUSH".equalsIgnoreCase(channel)) {
            return new PushNotification();
        }
        return null;
    }
}


