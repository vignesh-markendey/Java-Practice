package HomePractice;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArithmeticTest {
    int firstNumber, secondNumber, expectedResult;
    Arithmetic arithmetic_object = new Arithmetic();

    public ArithmeticTest(int firstNumber, int secondNumber, int expectedResult){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Integer[][] { {1,2,3}, {4,5,9}, {5,5,10}, {0,0,0} });
    }

    @Test
    public void testArithmeticTest(){
        Assert.assertEquals(expectedResult, arithmetic_object.sum(firstNumber, secondNumber));
    }

}
