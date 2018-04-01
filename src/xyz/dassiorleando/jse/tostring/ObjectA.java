package xyz.dassiorleando.jse.tostring;

import java.util.Objects;

public class ObjectA {
    private String propA;
    private ObjectB objectB1;
    private ObjectB objectB2;

    public ObjectA(String propA, ObjectB objectB1) {
        this.propA = propA;
        this.objectB1 = objectB1;
    }

    @Override
    public String toString() {
        return "ObjectA{" +
                "propA='" + propA + '\'' +
                ", objectB1=" + Objects.toString(objectB1) +
                ", objectB2=" + Objects.toString(objectB2) +
                '}';
    }
}
