public class OddEvenValuesInArray {
    //HW8 Part 1.1 Arrays #10
    /*
    Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
    и возвращает количество четных чисел в этом массиве.
     */


    public int countEvenValuesInArray(int[] array) {

        int count = 0;

        if (array.length == 0) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }










}
