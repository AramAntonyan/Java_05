import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {
    //Проверьте работу метода на числах 555, 0 и -555
    //Positive
    //number = 555
    @Test
    public void testPositiveNumberIsTrue() {
        //Arrange
        int number = 555;
        boolean expectedResult = true;

        //Act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    //Positive
    //number = -555
    @Test
    public void testNegativeNumberIsFalse() {
        //Arrange
        int number = -555;
        boolean expectedResult = false;

        //Act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


    //Positive
    //number = 0
    @Test
    public void testNumberIsZero() {
        //Arrange
        int number = 0;
        boolean expectedResult = true;

        //Act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}