package org.tondeuse;

import org.tondeuse.application.MowerSimulationRunner;

/**
 * The entry point of the mower application.
 * This class use the MowerSimulationRunner to run the simulation.
 */
public class Main {
    // Name of the input data file
    private static final String inputFileName = "input.txt";

    public static void main(String[] args) {
        new MowerSimulationRunner().run(inputFileName);
    }
}