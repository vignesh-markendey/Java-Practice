package HomePractice.FactoryMethod2;

public class OSFactory {

    public OS getInstance(String type){
        if(type.equals("Android"))
            return new Android();

        else if(type.equals("Mac"))
            return new Mac();
        else
            return new Windows();
    }
}
