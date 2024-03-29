package gr.aueb.cf.model;
/*
 * We create instances of these classes and pass them to the printFields method,
 * which uses the Java Reflection API to get all fields of the object and print their values.
 *
 * The printFields method uses the getDeclaredFields method of the Class class
 * to get all fields of the object, and the setAccessible method to set the
 * accessibility of the field to true, which allows us to access the value of
 * the field even if it has private access. Finally, we use the get method of the
 * Field class to get the value of the field and print it to the console.
 */


import java.lang.reflect.Field;

public class MainReflection {

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





