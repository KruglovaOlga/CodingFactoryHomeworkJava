package gr.aueb.cf.ch6;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Έστω ένας ταξινομημένος πίνακας με επαναλαμβανόμενα
 * στοιχεία. Γράψτε μία μέθοδο int[] getLowAndHighIndexOf(int[]
 * arr, int key) που να υπολογίζει και να επιστρέφει τα low και high
 * index ενός πίνακα arr, για ένα ακέραιο key που λαμβάνει ως
 * παράμετρο.
 */
public class GetLowAndHighIndexOfArrInt {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int[] indexes = new int[2];
        indexes = getLowAndHighIndexOf(arr, 8);
        System.out.println("{" + indexes[0] + ", " + indexes[1] + "}");
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = 0;
        int high = low;
        int[] lowHigh = new int[2];
        boolean flag = false;

        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                flag = true;
                low++;
                high = i;
            }
        }

        if (flag == false) {
            System.out.println("The key was NOT found!");
        } else {
            lowHigh[1] = high;
            lowHigh[0] = high - low + 1;
        }
        return lowHigh;
    }
}


