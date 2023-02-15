import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    //HW8 Part 1.1 Arrays #10
    //Positive test
    //return count
    @Test
    public void testEvenValuesInArray_HappyPath() {

        //Arrange
        int[] array = new int[]{0, 1, 2, 45, 34, 3, 7, 90};
        int expectedResult = 4;

        //Act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    //HW8 Part 1.1 Arrays #10
    //Negative test
    //array.length == 0
    //return -1
    @Test
    public void testEvenValuesWithZeroNumberInArray() {

        //Arrange
        int[] array = new int[]{};
        int expectedResult = -1;

        //Act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //HW8 Part 1.1 Arrays #11
    @Test
    //Positive test
    //return count

    public void testOddValuesInArray_HappyPath() {

        //Arrange
        int[] array = new int[]{0, 1, 2, 45, 34, 3, 7, 90, 33, 1, 3, 3};
        int expectedResult = 8;

        //Act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    //Positive test with negative numbers
    //return count

    public void testOddValuesInArrayWithNegativeNumbers() {

        //Arrange
        int[] array = new int[]{-3, -4, -5, -1, -6};
        int expectedResult = 3;

        //Act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }


    @Test
    //Negative test
    //return -1

    public void testOddValuesInArrayWithEmptyArray() {

        //Arrange
        int[] array = new int[]{};
        int expectedResult = -1;

        //Act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //Assert
        Assert.assertEquals(expectedResult, actualResult);

    }





}
