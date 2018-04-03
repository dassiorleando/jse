package xyz.dassiorleando.jse.tostring;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Difference between toString() and String.valueOf
 * @see <a href="http://www.dassiorleando.xyz/safely-tostring-a-java-object"</a>
 * @author dassiorleando
 */
public class ToStringProgramUnitTest {

    @Test
    public void safeToStringTest() {
        ObjectB objectB = new ObjectB("Fake propB");
        ObjectA objectA = new ObjectA("Fake propA", objectB);

        String stringObjectA = Objects.toString(objectA);
        System.out.println(stringObjectA);

        assertNull(objectA.getObjectB2());
        assertTrue(stringObjectA.contains("objectB2=null"));
    }
}
