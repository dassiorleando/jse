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

    public String getPropA() {
        return propA;
    }

    public void setPropA(String propA) {
        this.propA = propA;
    }

    public ObjectB getObjectB1() {
        return objectB1;
    }

    public void setObjectB1(ObjectB objectB1) {
        this.objectB1 = objectB1;
    }

    public ObjectB getObjectB2() {
        return objectB2;
    }

    public void setObjectB2(ObjectB objectB2) {
        this.objectB2 = objectB2;
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
