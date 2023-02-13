import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OddIndicesTest {
    //1. Positive test
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}

    @Test
    public void testOddIndicesArray_HappyPath() {
        //Arrange
        int[] array = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = new int[]{590, 985, 68};


        //Act
        int[] actualResult = new OddIndices().oddIndices(array);

        //Assert;
        Assert.assertEquals(actualResult, expectedResult);
    }


//    @Ignore
    @Test
    public void testZeroArray() {

        //2. Negative test
        //Test Data:
        //Input = {}
        //Expected Result =  {}
        //Arrange
        int[] array = new int[]{};
        int[] expectedResult = new int[]{};


        //Act
        int[] actualResult = new OddIndices().oddIndices(array);

        //Assert;
        Assert.assertEquals(actualResult, expectedResult);
    }
}
