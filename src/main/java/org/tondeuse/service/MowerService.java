package org.tondeuse.service;

import org.tondeuse.model.Mower;

/**
 * Handle the execution of movement instructions for a Mower
 */
public class MowerService {

    /**
     * Executes an instruction on the mower.
     * D : turn right, G : turn left, A : move forward
     *
     * @param mower       the current mower
     * @param instruction the instruction to apply
     * @throws IllegalArgumentException if the instruction is invalid
     */
    public void handleInstruction(Mower mower, char instruction) {
        switch (instruction) {
            case 'D' -> mower.turnRight();
            case 'G' -> mower.turnLeft();
            case 'A' -> mower.moveForward();
            default -> throw new IllegalArgumentException("The instruction " + instruction + " is invalid !");
        }
    }
}
