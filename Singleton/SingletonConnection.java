package HomePractice.Singleton;

public class SingletonConnection {

    //note that the constructor and instance variable are private
    private static SingletonConnection instance = null;
    private SingletonConnection(){}
    //Note that this is the only method that can be accessed
    public static SingletonConnection getInstance(){
        if(instance == null) {
        System.out.println("Instance created!!!!");
        instance = new SingletonConnection();
        }
    else
        System.out.println("Instance has already been created!!!!");
        return instance; }
}
