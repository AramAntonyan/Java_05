import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {



    //1. Positive testing Happy path
    // if (number % 2 == 0)
    //return Even;

    @Test
    public void testEvenNumber_HappyPath() {

        //Arrange
        int number = 222222;
        String expectedResult = "Even";

        //Act
        String actualResult = new OddEven().oddEven(number);

        //Assert

        Assert.assertEquals(actualResult, expectedResult);

    }


    //2. Positive testing Happy path
    // if (number == 0)
    //return Even;

    @Test
    public void testEvenNumberEqualsZero_HappyPath() {

        //Arrange
        int number = 0;
        String expectedResult = "Even";

        //Act
        String actualResult = new OddEven().oddEven(number);

        //Assert

        Assert.assertEquals(actualResult, expectedResult);

    }

    //3. Positive testing Happy path
    // if (number != 0)
    //return Odd;

    @Test
    public void testOddNumber_HappyPath() {

        //Arrange
        int number = -345;
        String expectedResult = "Odd";

        //Act
        String actualResult = new OddEven().oddEven(number);

        //Assert

        Assert.assertEquals(actualResult, expectedResult);

    }

}
