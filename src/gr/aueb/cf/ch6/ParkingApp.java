package gr.aueb.cf.ch6;

/**
 * Έστω ένας δισδιάστατος πίνακας που περιέχει τα στοιχεία άφιξης και
 * αναχώρησης αυτοκινήτων σε μορφή arr[][] = {{1012, 1136}, {1317, 1417},
 * {1015, 1020}} Αναπτύξτε μία εφαρμογή που διαβάζει να εκτυπώνει τον
 * μέγιστο αριθμό αυτοκινήτων που είναι σταθμευμένα το ίδιο χρονικό διάστημα.
 * Για παράδειγμα στον παραπάνω πίνακα το αποτέλεσμα θα πρέπει να είναι: 2.
 * Το 1ο αυτοκίνητο αφίχθη στις 10:12 και αναχώρησε στις 11:36, το 3ο
 * αυτοκίνητο αφίχθη στις 10:15 και αναχώρησε στις 10:20. Επομένως, το 1ο και
 * το 3ο αυτοκίνητο ήταν παρόντα το ίδιο χρονικό διάστημα.
 */
public class ParkingApp {

    public static void main(String[] args) {
        int arr[][] = {{1012, 1136}, {1317, 1417},
                {1015, 1020}};

        int state[][] = new int[2 * arr.length][2];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                if (j == 0) {
                    state[i * 2][0] = arr[i][j];
                    state[i * 2][1] = 1;
                } else {
                    state[i * 2 + 1][0]=arr[i][j];
                    state[i * 2 + 1][1]=0;
                }

            }
        }

        java.util.Arrays.sort(state, new java.util.Comparator<int[]>() {
                    public int compare(int[] a, int[] b) {
                        return Integer.compare(a[0], b[0]);
                    }
                });

        int numberOfCars = maxSequence2DArray(state);

        System.out.println("Mέγιστο αριθμό αυτοκινήτων που ήταν " +
                "σταθμευμένα το ίδιο χρονικό διάστημα: " + numberOfCars);


    }
        public static int maxSequence2DArray(int[][] array) {
            int count = 0;
            int maxSequence = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][1] == 1) {
                        count++;
                        maxSequence = count;
                    }else count = 0;

                }
            } return maxSequence;
        }
}

//προσπαθεια υλοποιησης. δεν βγαζει σωστα αποτελεσματα