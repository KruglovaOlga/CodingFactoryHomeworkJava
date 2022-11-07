package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Εμφανίζει επαναληπτικά ένα μενού με τις επιλογές,
 * το οποίο να επαναλαμβάνεται μέχρι ο χρήστης να
 * δώσει τον αριθμό 5.
 */
public class MenuFeedbackWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Eπιλέξτε ένα από τα παρακάτω: ");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Αναζήτηση");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Ενημέρωση");
            System.out.println("5. Έξοδος");

            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Επιλέξατε ΕΙΣΑΓΩΓΗ\n");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε ΑΝΑΖΗΤΗΣΗ\n");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε ΔΙΑΓΡΑΦΗ\n");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε ΕΝΗΜΕΡΩΣΗ\n");
            } else if (choice == 5) {
                System.out.println("Επιλέξατε ΕΞΟΔΟ\n");
            } else {
                System.out.println("\nΛΑΘΟΣ ΕΠΙΛΟΓΗ!\n");
            }

        } while (choice != 5);

        System.out.println("Goodbye!");
    }
}
