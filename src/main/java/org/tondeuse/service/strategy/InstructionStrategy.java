package org.tondeuse.service.strategy;

import org.tondeuse.model.Mower;

/**
 * Strategy interface for mower's instruction.
 * It can help to separate the logic, increase extensibility
 * and flexibility for the code.
 */
public interface InstructionStrategy {
    /**
     * Execute the instruction.
     * @param mower the mower that needs to execute instructions.
     */
    void execute(Mower mower);
}
