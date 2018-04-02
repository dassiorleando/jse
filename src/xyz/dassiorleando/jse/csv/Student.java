package xyz.dassiorleando.jse.csv;

import java.util.List;

public class Student {
    private String name;
    private String programmingLanguage;
    private String seniority;

    private void init() {
        this.name = "";
        this.programmingLanguage = "";
        this.seniority = "";
    }

    public Student(List<String> row) {
        init();

        int size = row.size();
        if ((size >= 1)) this.name = row.get(0);
        if ((size >= 2)) this.programmingLanguage = row.get(1);
        if ((size >= 3)) this.seniority = row.get(2);
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
