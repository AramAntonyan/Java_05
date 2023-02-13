import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {
    @Test
    //(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
    public void testCreateIntArray() {
        //Arrange

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

        //Act
        int[] actualResult = new CreateArray().createArray(a, b, c, d, e);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    //(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
    public void testCreateDoubleArray() {
        //Arrange
        double a = 1.1;
        double b = 2.5;
        double c = 3.7;
        double d = 4.0;
        double e = 5.5;
        double[] expectedResult = new double[]{1.1, 2.5, 3.7, 4.0, 5.5};

        //Act
        double[] actualResult = new CreateArray().createDoubleArray(a, b, c, d, e);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }



    @Test
    //(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
    public void testCreateStringArray() {
        //Arrange
        String a = "It";
        String b = "was";
        String c = "an";
        String d = "apple";
        String e = "pie";
        String[] expectedResult = new String[]{"It", "was", "an", "apple", "pie"};

        //Act
        String[] actualResult = new CreateArray().createStringArray(a, b, c, d, e);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
    public void testCreateArrayFromText() {
        //Arrange
        String sentence = "It was an apple pie";
        String[] expectedResult = new String[]{"It", "was", "an", "apple", "pie"};

        //Act

        String[] actualResult = new CreateArray().createArrayFromText(sentence);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
