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
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

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
        double[] expectedResult = {1.0, 2.0, 3.0, 0.0, 0.0};

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
        double[] expectedResult = {2147483647.0, -2147483648.0, 3.0, 4.0, 5.0};

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
        double[] expectedResult = {};

        //Act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(intArray);

        //Assert

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //Positive
    //({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
    //Arrange
    public void testDoubleToIntArray_HappyPath() {
        double[] doubleArray = new double[]{1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

        //Act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(doubleArray);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //Negative
    //(double{}) -> int{}
    //Arrange
    public void testDoubleIsEmptyToIntArray() {
        double[] doubleArray = new double[]{};
        int[] expectedResult = new int[]{};

        //Act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(doubleArray);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    //Positive
    // toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
    //Arrange
    public void testIntArrayValuesToStringArrayValues_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = new String[]{"1", "2", "3", "4", "5"};

        //Act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //Negative
    // toStringArray({}) -> {}
    //Arrange
    public void testZeroIntArrayValuesToStringZeroArrayValues() {
        int[] array = {};
        String[] expectedResult = new String[]{};

        //Act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //HW8 Part 1.1 Arrays #9
    @Test
    //Positive
    // toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
    //Arrange

    public void testDoubleValuesArrayToStringValuesArray_HappyPath() {
        //Arrange

        double[] arrayDouble = new double[]{1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = new String[]{"1.1", "2.5", "3.7", "4.0", "5.5"};

        //Act
        String[] actualResult = new ManipulationsWithArrays().fromDoubleToStringArray(arrayDouble);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //Positive
    // toStringArray({}) -> {}
    //Arrange

    public void testDoubleValuesZeroArrayToStringValuesZeroArray_HappyPath() {
        //Arrange

        double[] arrayDouble = new double[]{};
        String[] expectedResult = new String[]{};

        //Act
        String[] actualResult = new ManipulationsWithArrays().fromDoubleToStringArray(arrayDouble);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    //HW8 Part 1.1 Arrays #12
    /*
    В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
    который принимает на вход массив целых чисел и число number.
    Метод возвращает значение true, если все элементы массива больше number,
    иначе возвращает false.
     */

    @Test
    //Positive test Happy Path
    //return true
    public void testEveryElementInArrayIsBiggerThanNumber_HappyPath() {

        //Arrange
        int[] array = new int[]{6, 7, 8, 9, 10};
        int number = 5;
        boolean expectedResult = true;

        //Act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);


    }

    @Test
    //At least one element in array is smaller than number
    //return false

    public void testSomeElementInArrayIsSmallerThanNumber() {

        //Arrange
        int[] array = new int[]{4, 7, 8, 9, 10};
        int number = 5;
        boolean expectedResult = false;

        //Act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);


    }


    @Test
    //One element in array is equals to number
    //return false

    public void testOneElementInArrayIsSEqualsToNumber() {

        //Arrange
        int[] array = new int[]{5, 7, 8, 9, 10};
        int number = 5;
        boolean expectedResult = false;

        //Act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);


    }


    @Test
    //Negative test
    //Empty array
    //return false

    public void testEmptyArray_NegativeTest() {

        //Arrange
        int[] array = new int[]{};
        int number = 5;
        boolean expectedResult = false;

        //Act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);


    }



}
