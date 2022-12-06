package gr.aueb.cf.ch7;
/**
 *  Ένα πρόγραμμα που να αποκρυπτογραφεί / αντικαθιστά κάθε
 * χαρακτήρα του String με τον λεξικογραφικά
 * (ASCII-κογραφικα!) προηγούμενο
 */

import java.util.Scanner;

public class DecoderApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int KEY = -1;
        String s = "";

        System.out.println("Please, insert a String You'd like to decode");
        s = sc.nextLine();
        char[] c = new char[s.length()];
        int[] values = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
            values[i] = c[i];
        }

        //Ibwf!gbjui
        System.out.printf("The ASCII value of character_s in a String %s is\n ", s);
        for (int i = 0; i < values.length; i++) {
            System.out.print((values[i]) + " ");
            values[i] = values[i]+KEY;
            c[i] = ((char)values[i]);
        }

        System.out.print("\nDecoded String: ");
        String newStr = new String(c);
        System.out.println(newStr);
    }
}

