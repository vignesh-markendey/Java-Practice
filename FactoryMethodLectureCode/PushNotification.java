package HomePractice.FactoryMethodLectureCode;

public class PushNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending a push Notification!");
    }
}
