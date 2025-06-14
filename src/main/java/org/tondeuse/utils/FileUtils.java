package org.tondeuse.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Utility class for file operations, e.g. reading input files.
 */
public class FileUtils {

    /**
     * Read all the lines of a file.
     *
     * @param fileName The name of the file
     * @return the list of strings that represent all the lines of that file.
     */
    public static List<String> readLinesInFile(String fileName) throws IOException {
        // We use try with resources to make sure the file reading stream is always closed automatically
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            return lines.collect(Collectors.toList());
        }
    }
}
