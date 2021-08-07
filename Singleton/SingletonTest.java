package HomePractice.Singleton;

public class SingletonTest {

    public static void main(String[] args) {
    //We cannot instantiate it!
    //SingletonConnection db = new SingletonConnection();

        SingletonConnection.getInstance();
        SingletonConnection.getInstance();
        SingletonConnection.getInstance();
    }
}
