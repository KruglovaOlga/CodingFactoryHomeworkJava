package gr.aueb.cf.ch3;
/**
 *          μία εφαρμογή που να εμφανίζει ένα μενού με 6 επιλογές.
 *          Κάθε μία από τις πέντε πρώτες επιλογές θα
 *         πρέπει να υλοποιηθεί με μέθοδο
 *         • Ο χρήστης θα δίνει ένα αριθμό για αστεράκια
 *         • Οι επιλογές 3, 4, και 5 θα πρέπει να υλοποιηθούν με
 *         τη βοήθεια της μεθόδου της επιλογής 1
 *         • Το πρόγραμμα θα πρέπει να τρέχει μέχρι ο
 *         χρήστης να επιλέξει την Επιλογή 6
 */
// @author Olga Kruglova

import java.util.Scanner;


public class Menu5Games {

    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        int choice = 0;
        int stars = 0;

        do {
            printMenu();
            choice = in.nextInt();
            if(choice < 6 && choice > 0) {
                System.out.println("Με πόσα αστέρια θέλεις να παίξεις?");
                stars = in.nextInt();
            }

            switch (choice) {
                case 1:
                    printNHorizontalStars(stars);
                    break;
                case 2:
                    printNVerticalStars(stars);
                    break;
                case 3:
                    for (int i = stars; i > 0; i--) {
                        printNHorizontalStars(stars);
                    }
                    break;
                case 4:
                    for (int i = stars; i > 0; i--) {
                        printNHorizontalStars(stars - i + 1);
                    }
                    break;
                case 5:
                    for (int i = stars; i > 0; i--) {
                        printNHorizontalStars(i);
                    }
                    break;
                case 6:
                    System.out.println("Επιτυχής έξοδος");
                    break;
                default:
                    System.out.println("Λάθος επιλογή");
                    break;
            }
        } while (choice != 6);

    }

    /**
     * prints choises.
     */
    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια από 1 εώς n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια από n εώς 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static void printNHorizontalStars(int choice) {
        int i = 1;
        while (i <= choice) {
            System.out.print(" * ");
            i++;
        }
        System.out.println();
    }

    public static void printNVerticalStars(int choice) {
        int i = 1;

        while (i <= choice) {
            System.out.println("*");
            i++;
        }
        System.out.println();
    }
}


