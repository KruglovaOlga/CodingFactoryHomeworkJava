package gr.aueb.cf.ch9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * πρόγραμμα που να διαβάζει Όνομα, Επώνυμο και δύο Βαθμούς μαθητών,
 * να βρίσκει το μέσο όρο και να εκτυπώνει στο αρχείο primOut.txt
 * το Όνομα, Επώνυμο και τον μέσο όρο για κάθε μαθητή καθώς και σε
 * ένα log αρχείο log.txt τυχόν λάθη
 */
// Υποθέτω πως διαβάζει από πληκτρολόγιο
// οι βαθμοί είναι δεκαδικοί
public class GradesApp {
    final public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            greeting();

        while (true) {

            List<Object> student = getStudentData();
            //System.out.println(student);
            if (((Float.valueOf((Float) student.get(2)) < 0 || (Float.valueOf((Float) student.get(2)) > 10))) ||
                ((Float.valueOf((Float) student.get(3)) < 0 || (Float.valueOf((Float) student.get(3)) > 10)))) {
                writeIncorrectData(student);
            } else {
                writeStudentData(student);
            }
        }


    }

    public static List<Object> getStudentData() {
        String lName;
        String fName;
        float fGrade;
        float sGrade;

        try {
            System.out.println("Student's lastname: ");
            lName = scanner.nextLine();
            if (lName.equalsIgnoreCase("end")) {
                leaving();
                System.exit(0);
            }
        } catch(InputMismatchException ime) {
            System.out.println("Please input in valid format");
            lName = scanner.nextLine();

        }

        try {
            System.out.println("Student's firstname: ");
            fName = scanner.nextLine();
            if (fName.equalsIgnoreCase("end")) {
                leaving();
                System.exit(0);
            }
        } catch(InputMismatchException ime) {
            System.out.println("Please input in valid format");
            fName = scanner.nextLine();
        }

        try {
            System.out.println("The first grade: ");
            fGrade = scanner.nextFloat();
        } catch(InputMismatchException ime) {
            ime.getMessage();
            System.out.println("Please input in valid format");
            fGrade = scanner.nextFloat();
        }

        try {
            System.out.println("The second grade: ");
            sGrade = scanner.nextFloat();

        } catch(InputMismatchException ime) {
            System.out.println("Please input in valid format");
            sGrade = scanner.nextFloat();
        }
        float avgGrade = calcAvgGrade(fGrade, sGrade);

        return Arrays.asList(lName, fName, fGrade, sGrade, avgGrade);
    }

    public static void writeStudentData(List<Object> list) {

        try {
            File file = new File ("C:/temp/primOut.txt");
             if (!file.exists()) {
                  file.createNewFile();
             }
           FileWriter fw = new FileWriter(file, true);
           BufferedWriter bw = new BufferedWriter(fw);

           bw.newLine();
           bw.write(list.indexOf(0));
           bw.write(list.indexOf(1));
           bw.write(list.indexOf(4));
//           for(Object s : list) {
//               bw.write(s + " ");
//           }
           bw.close();

        } catch(IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    public static void writeIncorrectData(List<Object> list) {

        try {
            File file = new File ("C:/temp/log.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine();
            bw.write(list.indexOf(0));
            bw.write(list.indexOf(1));
            bw.write(list.indexOf(4));
//            for(Object s : list) {
//                bw.write(s + " ");
//            }
            bw.close();

        } catch(IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    public static float calcAvgGrade (float first, float second) {
        float avgG = (first + second) / 2;
       // String average = String.valueOf(avgG);
        return avgG;
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

}
