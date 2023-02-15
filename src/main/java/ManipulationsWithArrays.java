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

    //----------------------------------------------------------------------------------------//
    /*
    Написать метод toStringArray(), который принимает на вход массив целых чисел,
    и возвращает массив типа String[] из тех же чисел (желательно не использовать метод .toString(),
    нужно переводить вручную)
    Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
     */

    public String[] toStringArray(int[] array) {
        String[] arrayString = new String[array.length];
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                arrayString[i] = "" + array[i];
            }
            return arrayString;
        }
        return new String[]{};
    }
    //----------------------------------------------------------------------------------------//
    /*
    HW8 Part 1.1 Arrays #9
    Перегрузить метод toStringArray() параметром double[].
    Этот метод должен возвращать массив типа String[] (желательно не использовать метод .toString(),
    нужно переводить вручную)
    Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
     */

    public String[] fromDoubleToStringArray(double[] array) {
        String[] arrayString = new String[array.length];
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                arrayString[i] = "" + array[i];
            }
            return arrayString;
        }
        return new String[]{};
    }


    //HW8 Part 1.1 Arrays #12
    /*
    В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
    который принимает на вход массив целых чисел и число number.
    Метод возвращает значение true, если все элементы массива больше number,
    иначе возвращает false.
     */

    public boolean areValuesGreaterThanNumber(int[] array, int number) {

        if (array.length == 0) {
            return false;
        }

        int countOfBiggerElements = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                countOfBiggerElements++;
            }

        }
        if (countOfBiggerElements == array.length) {
            return true;
        }
        return false;
    }


}
