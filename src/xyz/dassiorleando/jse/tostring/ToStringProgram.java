package xyz.dassiorleando.jse.tostring;

import java.util.Objects;

/**
 * Difference between toString() and String.valueOf
 * @author dassiorleando
 */
public class ToStringProgram {

    public static void main(String[] args) {
        ObjectB objectB = new ObjectB("Fake propB");
        ObjectA objectA = new ObjectA("Fake propA", objectB);

        System.out.println(Objects.toString(objectA));
    }
}
