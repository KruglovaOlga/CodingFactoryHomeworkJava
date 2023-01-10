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




