package HomePractice;

import org.junit.Assert;
import org.junit.Test;

public class PathCompleteTest {


    @Test
    public void testPath(){


        Assert.assertEquals(10, PathComplete.findSomething(10, 8, 7));
        Assert.assertEquals(10, PathComplete.findSomething(9, 8, 10));
        Assert.assertEquals(10, PathComplete.findSomething(9, 10, 8));
        Assert.assertEquals(10, PathComplete.findSomething(8, 9, 10));



    }
}
