/*
Написать алгоритм OddIndices, который принимает массив целых чисел,
и возвращает массив значений нечетных индексов
Test Data:
Input = {-45, 590, 234, 985, 12, 68}
Expected Result =  {590, 985, 68}

 */

import project_utils.Utils;


public class OddIndices {
    public int[] oddIndices(int[] array) {
        if (Utils.checkForEmptyArray(array)) {
            int[] arrayOddIndices = new int[array.length / 2];
            int countOdd = 0;
            for (int i = 1; i < array.length; i += 2) {
                arrayOddIndices[countOdd] = array[i];
                countOdd++;
            }
            return arrayOddIndices;
        }
        return new int[]{};
    }


}
