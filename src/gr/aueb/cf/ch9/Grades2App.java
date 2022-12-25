package gr.aueb.cf.ch9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * πρόγραμμα που να διαβάζει Όνομα, Επώνυμο και δύο Βαθμούς μαθητών,
 * να βρίσκει το μέσο όρο και να εκτυπώνει στο αρχείο primOut.txt
 * το Όνομα, Επώνυμο και τον μέσο όρο για κάθε μαθητή καθώς και σε
 * ένα log αρχείο log.txt τυχόν λάθη
 */
// Υποθέτω πως διαβάζει από πληκτρολόγιο
// οι βαθμοί είναι δεκαδικοί
// είσαγει ορθά το όνομα και το επώνυμο(ΝΑΝ)
public class Grades2App {

    final public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String inputStr = "";
        Double grade1 = 0.0;
        Double grade2 = 0.0;

        greeting();


        while (true) {

            System.out.println("Student's lastname: ");
            String lName = readData();

            System.out.println("Student's firstname: ");
            String fName = readData();

            System.out.println("The first grade: ");
            String fGrade = readData();

            System.out.println("The second grade: ");
            String sGrade = readData();


            try {
                grade1 = Double.parseDouble(fGrade);
                grade2 = Double.parseDouble(sGrade);
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            }

            if (grade1 < 0 || grade1 > 10 || grade2 < 0 || grade2 > 10) {
                writeIncorrectData(lName, fName, fGrade, sGrade);

            } else {
                Double avgGrade = calcAvgGrade(grade1, grade2);
                writeStudentData(lName, fName, avgGrade);
        }

    }
}

    public static void greeting() {
        System.out.println("Hello!\n" +
                "In this program you write student's name and grades.\n" +
                "The program calculates avg of grades for each student\n" +
                "and writes it to primOut.txt file. Any incorrect data\n" +
                "you can find in log.txt. ");
        System.out.println();
        System.out.println("For end process, please write 'END' \n");
        System.out.println("Let's start\n");
    }

    public static void leaving() {
        System.out.println("Done!");
        System.out.println("Thank you!");
        System.out.println("Goodbye!");
    }

    public static String readData () {
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("end") || input.equals(" ")) {
            leaving();
            System.exit(0);
        }
        return input;
    }

    public static Double calcAvgGrade (Double first, Double second) {
        Double avgGrade = (first + second) / 2;
        return avgGrade;
    }

    public static void writeStudentData(String lastname, String firstname, Double average) throws IOException {
        File file = new File ("C:/temp/primOut.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);){

            bw.write(lastname + " " + firstname + " : " + average + "\n");

        } catch(IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    public static void writeIncorrectData(String lastname, String firstname, String grade1, String grade2) throws IOException {
        File file = new File ("C:/temp/log.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);) {

            bw.write(lastname + " " + firstname + " : " + grade1 + ", " + grade2 + "\n");

        } catch(IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

}
