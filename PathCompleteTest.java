package HomePractice;

import org.junit.Assert;
import org.junit.Test;

public class PathCompleteTest {


    @Test
    public void testPath(){

        //checking path-1 (a > b > c)
        Assert.assertEquals(10, PathComplete.findSomething(10, 8, 7));

        //checking path-2 (c > a > b)
        Assert.assertEquals(10, PathComplete.findSomething(9, 8, 10));

        //checking path-3 (a < b > c)
        Assert.assertEquals(10, PathComplete.findSomething(9, 10, 8));

        //checking path-4 (a < b < c)
        Assert.assertEquals(10, PathComplete.findSomething(8, 9, 10));



    }
}
