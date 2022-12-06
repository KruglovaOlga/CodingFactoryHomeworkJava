package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Ένα πρόγραμμα που να κρυπτογραφεί / αντικαθιστά κάθε
 * χαρακτήρα του String με τον λεξικογραφικά
 * (ASCII-κογραφικα!) επόμενο
 */
public class CoderApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int KEY = 1;
        String s = "";

        System.out.println("Please, insert a String You'd like to code");
        s = sc.nextLine();
        char[] c = new char[s.length()];
        int[] values = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
            values[i] = c[i];
        }

        //"Olga" =  79 108 103 97
        System.out.printf("The ASCII value of character_s in a String %s is\n ", s);
        for (int i = 0; i < values.length; i++) {
            System.out.print((values[i] + KEY) + " ");
            values[i] = values[i]+1;
            c[i] = ((char)values[i]);
        }
        //"Olga" = 80 109 104 98
        System.out.print("\nNew String(coded): ");
        String newStr = new String(c);
        System.out.println(newStr);
    }
}
