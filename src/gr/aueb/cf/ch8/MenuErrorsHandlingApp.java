package gr.aueb.cf.ch8;
/**
 Αναπτύξτε μία μέθοδο που εμφανίζει ένα μενού με επιλογές
 από 1 έως 4 (και 5 για Exit) καθώς και μία μέθοδο int
 getChoice() για να διαβάσετε το choice του χρήστη με Scanner
 • Στη μέθοδο int getChoice() αν ο χρήστης δώσει μη-ακέραιο
 ελέγξτε κατάλληλα με state-testing (hasNextInt())
 • Αναπτύξτε επίσης μία μέθοδο void printChoice(int choice) που
 εκτυπώνει την επιλογή. Αν η επιλογή δεν είναι μεταξύ 1-5 τότε
 δημιουργεί (throws) ένα IllegalArgumentException, το οποίο
 παρότι είναι RunTimeException, θα μπορούσαμε στη
 συγκεκριμένη περίπτωση να κάνουμε recover και να κάναμε
 try/catch στη main
 • Διαμορφώστε τη main ώστε να κάνει catch το exception και να
 επικοινωνεί με τον χρήστη με κατάλληλο μήνυμα
 */
import java.util.Scanner;

public class MenuErrorsHandlingApp {
    final static Scanner in  = new Scanner(System.in);

    public static void main(String[] args) throws RuntimeException, InterruptedException {
        int choice = -1;
        String inputStr = "";

        do {
            showMenu();
            inputStr = getChoice();

            if (isNumeric(inputStr)) {
                choice = Integer.parseInt(inputStr);
                //System.out.println(choice);
            } else {
                System.out.println("\nΛΑΘΟΣ ΕΠΙΛΟΓΗ! " + inputStr);
                System.out.println("Παρακαλώ, επιλέξτε από 1 εώς 4\n 5 για ΕΞΟΔΟ\n");

                Thread.sleep(1000); //allow user to read a message

            }
            printChoice(choice);

        } while (!(inputStr.equals("5")) );

    }

    public static void showMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Αναζήτηση");
        System.out.println("3. Διαγραφή");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
    }


    public static void printChoice(int choice) {
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
            }

        }

    /**
     * check if the input string is a number
     * @param str       inputStr
     * @return          true / false
     */
        private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }

    /**
     * read the input string
     * @return      String user input
     */
    public static String getChoice() {
        String str = "";
        try {
             str = in.nextLine().trim();
        } catch (NumberFormatException ex){
            ex.printStackTrace();

        }
        return str;
    }

}






