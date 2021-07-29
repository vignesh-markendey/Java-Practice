package HomePractice;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd(){

        Calculator object = new Calculator(5);

        Assert.assertEquals(10, object.add(5));
    }
}
