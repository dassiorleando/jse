package nullity;

/**
 * Old approach I was using to throw an NPE with my proper utility
 */
public class MyUtility {

    public static void invalidObject(Object o) {
        if(o == null) {
            throw new NullPointerException();
        }
    }

    public static void invalidObject(Object o, String message) {
        if(o == null) {
            throw new NullPointerException(message);
        }
    }

    // More method here according to our need ...
}
