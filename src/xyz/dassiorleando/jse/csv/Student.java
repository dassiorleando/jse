package xyz.dassiorleando.jse.csv;

public class Student {
    private String name;
    private String programmingLanguage;
    private String seniority;

    public Student(String name, String programmingLanguage, String seniority) {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", seniority='" + seniority + '\'' +
                '}';
    }
}
