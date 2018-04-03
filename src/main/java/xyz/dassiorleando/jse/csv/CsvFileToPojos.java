package xyz.dassiorleando.jse.csv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A simple line of code to loop through an entire csv file and convert it to a list of pojos
 * @see <a href="http://www.dassiorleando.xyz/**"</a>
 * @author dassiorleando
 */
public class CsvFileToPojos {

    /**
     *
     * @param filePath The location of the csv file
     * @return the list of students(rows) contained in the file
     * @throws IOException
     */
    public static List<Student> build(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .filter(line -> !line.startsWith("name,"))      // We skip the first line
                .map(line -> {      // For each other line let's build a student object
                    List<String> row = Arrays.asList(line.split(","));
                    return new Student(row);
                }).collect(Collectors.toList());
    }
}
