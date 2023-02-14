public class ManipulationsWithArrays {
    /*
    Написать метод multiplyArrayByNumber(), который принимает на вход массив
    целых чисел и число int number. Метод возвращает массив тех же чисел,
    умноженных на number.
    Например, multiplyArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
    Эту задачу не понял и не смог решить!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     */

    //-------------------------------------------------------------------------------------//

    /*
    Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
    и возвращает массив типа double[] из тех же чисел
    Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
     */

    public double[] toDoubleArray(int[] intArray) {
        double[] doubleArray = new double[intArray.length];
        if (intArray.length > 0) {
            for (int i = 0; i < intArray.length; i++) {
                doubleArray[i] = intArray[i];
            }

        } else {
            return new double[]{};
        }
        return doubleArray;
    }
//----------------------------------------------------------------------------------------//

    /*
    Написать метод toIntArray(), который принимает на вход массив типа double[],
    и возвращает массив типа int[] из тех же чисел
    Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
     */

    public int[] toIntArray(double[] array) {
        int[] arrayInt = new int[array.length];
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                arrayInt[i] = (int) array[i];
            }
        } else {
            return new int[]{};
        }
        return arrayInt;
    }
}
