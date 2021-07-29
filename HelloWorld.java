package HomePractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorld {
    String print() {

        return "Hello World";
    }



    @Test
    public void simplePrintTest(){
        Assertions.assertEquals("Hello World",print());
    }


}