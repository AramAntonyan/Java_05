//Эти тесты не очень верны. Если убрать у double ".0", тесты все равно работают.
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {


    @Test
    //Positive
    //Arrange
    //({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
    public void testToDoubleArray_HappyPath() {
        int[] intArray = {1, 2, 3, 4, 5};
        double[]  expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        //Act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(intArray);

        //Assert

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //Positive
    //Arrange
    //({1, 2, 3, 0, 0}) -> {1.0, 2.0, 3.0, 0.0, 0.0}
    public void testIntZeroValueInArrayToDoubleArray() {
        int[] intArray = {1, 2, 3, 0, 0};
        double[]  expectedResult = {1.0, 2.0, 3.0, 0.0, 0.0};

        //Act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(intArray);

        //Assert

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //Positive
    //Arrange
    //({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
    public void testMaxAndMinValueIntToDoubleArray() {
        int[] intArray = {Integer.MAX_VALUE, Integer.MIN_VALUE, 3, 4, 5};
        double[]  expectedResult = {2147483647.0, -2147483648.0, 3.0, 4.0, 5.0};

        //Act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(intArray);

        //Assert

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //Negative
    //Arrange
    //({}) -> {}
    public void testIntArrayIsEmptyToDoubleArray() {
        int[] intArray = {};
        double[]  expectedResult = {};

        //Act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(intArray);

        //Assert

        Assert.assertEquals(actualResult, expectedResult);
    }

}
