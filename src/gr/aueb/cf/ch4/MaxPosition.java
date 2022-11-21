package gr.aueb.cf.ch4;
/**μία γενική μέθοδο εύρεσης του  μέγιστου ενός πίνακα
 * getMaxPosition (int[]  arr, int low, int high) που
 * επιστρέφει τη  θέση  στον  πίνακα  arr  του  μέγιστου
 *  στοιχείου του πίνακα
 */
public class MaxPosition {

    public static void main(String[] args) {
        int[] arr = {1, 32, 5, 6, 9, 15, 0, 54, 13, 11};
        int position = getMaxPosition(arr, 0, 12);
        System.out.println("Max element is found in the position: " + position);
    }
    public static int getMaxPosition (int[]  arr, int low, int high) {

        int maxPosition = 0;

        if ((arr == null) || (arr.length == 0))
            System.out.println(-1);

            for (int i = 1; i < high; i++) {
                if (high > arr.length) high = arr.length;
                if (arr[i] > arr[maxPosition]) {
                    maxPosition = i;
                    //System.out.print(maxPosition+" ");
                   // System.out.println(arr[maxPosition]);
                }
            }


        return maxPosition;
    }
}
