package xyz.dassiorleando.jse.nullity;

/**
 * Old approach I was using to throw an NPE with my proper utility
 * @author dassiorleando
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
