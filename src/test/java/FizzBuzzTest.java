import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //1. Positive testing Happy path
    // if (start <= end)
    //return result;


    //start < end
    @Test

    public void testStartLessThanEnd_HappyPath() {
        //AAA
        //Arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};


        //Act
//        FizzBuzz fizzBuzz = new FizzBuzz();


        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


    //start < end start negative
    @Test
//    @Ignore
    public void testStartLessThanEnd_StartIsNegative_HappyPath() {
        //AAA
        //Arrange
        int start = -20;
        int end = -15;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz"};


        //Act
//        FizzBuzz fizzBuzz = new FizzBuzz();


        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


    //start = end
    @Test

    public void testStartEqualsEnd_HappyPath() {
        //AAA
        //Arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};


        //Act
//        FizzBuzz fizzBuzz = new FizzBuzz();


        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


    //2. Negative testing
    // if (start > end)
    //return new String[0];

    @Test

    public void testStartGreaterThanEnd_Negative() {
        //AAA
        //Arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};


        //Act
//        FizzBuzz fizzBuzz = new FizzBuzz();


        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


}
