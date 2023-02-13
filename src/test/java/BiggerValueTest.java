import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    //Positive
    //a < b
    //Test Data:
    //a = 3333, b = 9999
    //Expected Result = 9999

    @Test
    public void testBiggerNumberASmallerThanB() {
        //Arrange
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        //Act
        int actualResult = new BiggerValue().biggerValue(a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive
    //a > b
    //Test Data:
    //a = 10, b = 9
    //Expected Result = 10
    @Test
    public void testBiggerNumberAGreaterThanB() {
        //Arrange
        int a = 10;
        int b = 9;
        int expectedResult = 10;

        //Act
        int actualResult = new BiggerValue().biggerValue(a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Negative
    //a == b
    //Test Data:
    //a = 10, b = 10
    //Expected Result = 0
    @Test
    public void testAAndBAreEqualNumbers() {
        //Arrange
        int a = 10;
        int b = 10;
        int expectedResult = 0;

        //Act
        int actualResult = new BiggerValue().biggerValue(a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }




}
