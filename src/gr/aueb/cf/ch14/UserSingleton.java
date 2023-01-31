package gr.aueb.cf.ch14;

/**
 * Αναπτύξτε με eager instantiation ένα
 * Singleton User Class με πεδία Long id,
 * String username, String password
 */
public class UserSingleton {
    private static final Long id = 1L;
    private static final String username = "You";
    private static final String password = "248";
    private static final UserSingleton INSTANCE = new UserSingleton();
    private UserSingleton(){}
    public static UserSingleton getInstance() {
        return INSTANCE;
    }


}
