package gr.aueb.cf.model;


import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        UserCredentials chrisCredentials = new UserCredentials(67L, "chris", "chris67");
        User chris = new User(3L, "Chris", "R.");

        // Get fields for UserCredentials instance
        Class<?> chrisCredentialsClass = chrisCredentials.getClass();
        Field[] chrisCredentialsFields = chrisCredentialsClass.getDeclaredFields();

        // Print fields for UserCredentials instance
        System.out.print("{");
        for (Field field : chrisCredentialsFields) {
            System.out.print(field.getName() + ", ");
        }
        System.out.println("}");

        // Get fields for User instance
        Class<?> chrisClass = chris.getClass();
        Field[] chrisFields = chrisClass.getDeclaredFields();

        // Print fields for User instance
        System.out.print("{");
        for (Field field : chrisFields) {
            System.out.print(field.getName() + ", ");
        }
        System.out.println("}");
        }
    }

