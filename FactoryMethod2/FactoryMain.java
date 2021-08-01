package HomePractice.FactoryMethod2;

// this is the client code
//our intent here, is to be able to add multiple implementations without changing the client code
public class FactoryMain {

    public static void main(String[] args) {
        OSFactory osf = new OSFactory();
        OS obj = osf.getInstance("Mac");
        obj.spec();


    }
}
