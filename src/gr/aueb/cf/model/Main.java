package gr.aueb.cf.model;


import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        UserCredentials chrisCredentials = new UserCredentials(67L, "chris", "chris67");
        User chris = new User(3L, "Chris", "R.");

        System.out.println("{" + chris.getId() + ", "
                + chris.getFirstname() + ", "
                + chris.getLastname() + "}"
        );

        System.out.println("{" + chrisCredentials.getId() + ", "
                + chrisCredentials.getUsername() + ", "
                + chrisCredentials.getPassword() + "}"
        );

    }

}

/*
        UserCredentials chrisCredentials = new UserCredentials(67L, "chris", "chris67");
        User chris = new User(3L, "Chris", "R.");

        printFields(chrisCredentials);
        printFields(chris);
    }

    public static void printFields(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        System.out.print("{");
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                System.out.print(field.get(object) + ", ");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println("}");
    }
}
*/
