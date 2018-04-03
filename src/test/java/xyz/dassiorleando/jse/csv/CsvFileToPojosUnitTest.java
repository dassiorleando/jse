package xyz.dassiorleando.jse.csv;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test of CsvFileToPojos
 * @author dassiorleando
 */
public class CsvFileToPojosUnitTest {

    @Test
    public void build() throws IOException {
        // We give the location of the csv file
        List<Student> students = CsvFileToPojos.build("resources/dassi.csv");

        // We output all the students details
        students.forEach(System.out::println);

        assertEquals(students.size(), 3);
    }
}
