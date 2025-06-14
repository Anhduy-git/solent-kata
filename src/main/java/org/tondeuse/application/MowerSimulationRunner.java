package org.tondeuse.application;

import org.tondeuse.model.Lawn;
import org.tondeuse.model.Mower;
import org.tondeuse.model.Orientation;
import org.tondeuse.service.MowerService;
import org.tondeuse.utils.FileUtils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * This class is responsible for orchestrating the simulation of the mower.
 * It reads data for lawn and mowers from a file and then executes the corresponding instructions.
 */
public class MowerSimulationRunner {

    /**
     * Run the mower simulation
     *
     * @param inputFileName the name of the file to read input data
     */
    public void run(String inputFileName) {
        try {
            // Load file
            var intputFileUrl = getClass().getClassLoader().getResource(inputFileName);
            if (intputFileUrl == null) {
                throw new RuntimeException("The file cannot be found : " + inputFileName);
            }

            Path path = Paths.get(intputFileUrl.toURI());

            // Read lines in the input file
            List<String> lines = FileUtils.readLinesInFile(path.toString());

            // Read the boundaries of the lawn in file
            String[] lawnBoundaries = lines.getFirst().split(" ");
            int boundX = Integer.parseInt(lawnBoundaries[0]);
            int boundY = Integer.parseInt(lawnBoundaries[1]);

            // Create a new lawn
            Lawn lawn = new Lawn(boundX, boundY);

            // A mower service used for handle instructions logic of the mower
            MowerService mowerService = new MowerService();

            // Read the rest of the file in pairs (1 lines for mower position and 1 line for instructions)
            for (int i = 1; i < lines.size(); i += 2) {
                // read mower position (coordinates and orientation)
                String[] mowerPosition = lines.get(i).split(" ");
                String instructions = lines.get(i + 1);

                // Create a new mower
                Mower mower = new Mower(
                        Integer.parseInt(mowerPosition[0]),
                        Integer.parseInt(mowerPosition[1]),
                        lawn,
                        Orientation.valueOf(mowerPosition[2])
                );

                // Execute instructions
                for (char instruction : instructions.toCharArray()) {
                    mowerService.handleInstruction(mower, instruction);
                }

                // Print the position of mower (coordinates + orientation) after execute all instructions
                System.out.print(mower);

                // If this is not the last mower (the last 2 lines), then we need to print a space
                // to separate their results
                if (i < lines.size() - 2) {
                    System.out.print(" ");
                }

            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to run simulation: " + e.getMessage(), e);
        }
    }
}
