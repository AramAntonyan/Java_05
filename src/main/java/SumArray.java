/*
Написать алгоритм SumArray, который возвращает сумму всех чисел массива
Test Data:
{0, 1, 2, 3, 4, 5} → 15
{-7, -3} → -10
 */


public class SumArray {
    public int sumArray(int[] array) {
        int result = 0;
        for (int i : array) {

            result += i;
        }
        return result;
    }
}
