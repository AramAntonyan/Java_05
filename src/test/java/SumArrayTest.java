import org.testng.Assert;
import org.testng.annotations.Test;


public class SumArrayTest {

    @Test
    public void testSumPositiveValues() {
        //Arrange
        int[] array = new int[]{0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        //Act
        int actualResult = new SumArray().sumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }



    @Test
    public void testSumNegativeValues() {
        //Arrange
        int[] array = new int[]{-7, -3};
        int expectedResult = -10;

        //Act
        int actualResult = new SumArray().sumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testZeroLengthArray() {
        //Arrange
        int[] array = new int[]{};
        int expectedResult = 0;

        //Act
        int actualResult = new SumArray().sumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }



}
