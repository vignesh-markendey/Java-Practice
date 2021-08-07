package HomePractice.Observer;

//Observer demo - main class

public class ObserverDemo {

    public static void main(String[] args) {
        Customer c1 = new Customer("Bernardo");
        Customer c2 = new Customer("John");
        Customer c3 = new Customer("Lisa");
        Place p1 = new Place("McDonalds");
        Place p2 = new Place("Zara");
        p1.attach(c1);
        p1.attach(c2);
        p2.attach(c2);
        p2.attach(c3);
        System.out.println("NEW CASE!");
        p1.setCorona();
        p1.detach(c1);
        System.out.println("NEW CASE!");
        p1.setCorona();
        System.out.println("NEW CASE!");
        p2.setCorona();
    }

}
