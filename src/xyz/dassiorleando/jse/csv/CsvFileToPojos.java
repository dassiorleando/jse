package xyz.dassiorleando.jse.csv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A simple line of code to loop through an entire csv file and convert it to a list of pojos
 * @author dassiorleando
 */
public class CsvFileToPojos {

    public static void main(String [] args) throws IOException {
        // We give the location of the csv file
        List<Student> students = Files.lines(Paths.get("resources/dassi.csv"))
                .filter(line -> !line.startsWith("name,"))      // We skip the first line
                .map(line -> {      // For each other line let's build a student object
                    List<String> row = Arrays.asList(line.split(","));
                    return new Student(row.get(0), row.get(1), row.get(2));
                }).collect(Collectors.toList());

        // We output all the students details
        students.forEach(System.out::println);
    }
}
