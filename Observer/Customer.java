package HomePractice.Observer;

// Concrete Observer - implements abstract Observer
public class Customer implements Observer{

    private String name;
    public Customer(String name) {
        this.name = name;
    }
    @Override
    public void update(String msg) {
        System.out.println("Hey " + this.name + "! Message for you: " + msg );
    }
}
