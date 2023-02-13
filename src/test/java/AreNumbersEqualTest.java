import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    /*
    Test Data:
    89, 89
    Expected result: 0
    -89, 89
    Expected result: -1
    89, -89
    Expected result: 1
     */

    @Test
    public void testNumbersAreEquals(){
        //Arrange
        int num1 = 89;
        int num2 = 89;
        int expectedResult = 0;

        //Act
        int actualResult = new AreNumbersEqual().areNumbersEqual(num1, num2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testFirstNumberIsGreaterThanSecondNumber(){
        //num1 = 89
        //num2 = -89
        //expectedResult = 1
        //Arrange
        int num1 = 89;
        int num2 = -89;
        int expectedResult = 1;

        //Act
        int actualResult = new AreNumbersEqual().areNumbersEqual(num1, num2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testFirstNumberIsSmallerThanSecondNumber(){
        //num1 = -89
        //num2 = 89
        //expectedResult = -1
        //Arrange
        int num1 = -89;
        int num2 = 89;
        int expectedResult = -1;

        //Act
        int actualResult = new AreNumbersEqual().areNumbersEqual(num1, num2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
