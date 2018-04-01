package xyz.dassiorleando.jse.tostring;

public class ObjectB {
    private String propB;

    public ObjectB(String propB) {
        this.propB = propB;
    }

    @Override
    public String toString() {
        return "ObjectB{" +
                "propB='" + propB + '\'' +
                '}';
    }
}
