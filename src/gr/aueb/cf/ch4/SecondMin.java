package gr.aueb.cf.ch4;
/**ένα πρόγραμμα που βρίσκει το 2ο μικρότερο στοιχείο
 * ενός πίνακα, το  στοιχείο  δηλαδή  που  είναι  αμέσως
 *  μεγαλύτερο από το ελάχιστο στοιχείο
 */
public class SecondMin {

    public static void main(String[] args) {
        int[] arr = {1, 32, 5, 6, 9, 15, -10, 54, 13, 11};
        int num = getSecondMin(arr);
        System.out.println("the second min element is found: " + num);
    }
    public static int getSecondMin (int[]  arr) {

        int min = arr[0];
        int minPosition = 0;
        int secondMin = 0;

        if ((arr == null) || (arr.length == 0))
            System.out.println(-1);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minPosition]) {
                secondMin = min;
                min = arr[i];

                //System.out.print(secondMin + " ");
                //System.out.println(min);
            }
        }


        return secondMin;
    }
}
