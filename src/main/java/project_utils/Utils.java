package project_utils;

public class Utils {


    /*
    Methods to check whether the array is empty (int, double, String):
     */
    public static boolean checkForEmptyArray(int[] array) {
        if (array.length != 0) {
            return true;
        } else {
            return false;

        }
    }




    /*
    Methods for calculating the length of an array (int, double, boolean, String):
     */

    public static int lengthArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
        }
        return count;
    }


}