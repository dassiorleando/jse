package xyz.dassiorleando.jse.tostring;

public class ObjectB {
    private String propB;

    public ObjectB(String propB) {
        this.propB = propB;
    }

    public String getPropB() {
        return propB;
    }

    public void setPropB(String propB) {
        this.propB = propB;
    }

    @Override
    public String toString() {
        return "ObjectB{" +
                "propB='" + propB + '\'' +
                '}';
    }
}
