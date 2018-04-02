package xyz.dassiorleando.jse.tostring;

import java.util.Objects;

/**
 * Difference between toString() and String.valueOf
 * @see <a href="http://www.dassiorleando.xyz/safely-tostring-a-java-object"</a>
 * @author dassiorleando
 */
public class ToStringProgram {

    /**
     * Display the tostring with an optional parameter
     * @param args
     */
    public static void main(String[] args) {
        ObjectB objectB = new ObjectB("Fake propB");
        ObjectA objectA = new ObjectA("Fake propA", objectB);

        System.out.println(Objects.toString(objectA));
    }
}
