package org.tondeuse.utils;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit tests for the FileUtils class
 */
public class FileUtilsTest {

    /**
     * Test when the file exists and the FileUtils return correct lines in the file
     */
    @Test
    void testReadLinesInFile_fileExists_shouldReturnCorrectLines() throws IOException {
        // Create a temporary test file
        Path tempFile = Files.createTempFile("test_file", ".txt");
        List<String> expectedLines = List.of("3 3", "2 3 E", "AAGDA");
        Files.write(tempFile, expectedLines);

        // Call the read lines method, and check if we have read all the lines correctly
        List<String> actualLines = FileUtils.readLinesInFile(tempFile.toString());
        assertEquals(expectedLines, actualLines);

        // clean the test file
        Files.deleteIfExists(tempFile);
    }

    /**
     * Test when the file not exists
     */
    @Test
    void testReadLinesInFile_fileNotExist_shouldThrowsException() {
        String notExistFile = "test_file_not_exist.txt";
        assertThrows(IOException.class, () -> FileUtils.readLinesInFile(notExistFile));
    }
}
