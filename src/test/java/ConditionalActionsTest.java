import org.testng.Assert;
import org.testng.annotations.Test;


public class ConditionalActionsTest {
    //positive Happy Path
    //m % 7 == 0 && m % 9 == 0
    //return "Good Number";

    @Test
    public void testMultipleOfSevenAndNine_HappyPath() {
        //Arrange
        int m = 63;
        String expectedResult = "Good Number";

        //Act
        String actualResult = new ConditionalActions().conditionalActions(m);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //positive Happy Path
    //m % 9 == 0
    //return "Bad Number"

    public void testMultipleOfNine_HappyPath() {
        //Arrange
        int m = 27;
        String expectedResult = "Bad Number";

        //Act
        String actualResult = new ConditionalActions().conditionalActions(m);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    //positive Happy Path
    //m % 11 == 0
    //return "Poor Number"

    public void testMultipleOfEleven_HappyPath() {
        //Arrange
        int m = 22;
        String expectedResult = "Poor Number";

        //Act
        String actualResult = new ConditionalActions().conditionalActions(m);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    //any other numbers
    //return "-1"

    public void testMultipleAnyNumbers() {
        //Arrange
        int m = 23;
        String expectedResult = "-1";

        //Act
        String actualResult = new ConditionalActions().conditionalActions(m);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    //negative
    //m = 0
    //return "-1"
    public void testMultipleOfZero_Negative() {
        //Arrange
        int m = 0;
        String expectedResult = "Good Number";

        //Act
        String actualResult = new ConditionalActions().conditionalActions(m);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
