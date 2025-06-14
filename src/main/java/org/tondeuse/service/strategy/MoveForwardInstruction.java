package org.tondeuse.service.strategy;

import org.tondeuse.model.Mower;

/**
 * Represent an instruction for moving forward.
 */
public class MoveForwardInstruction implements InstructionStrategy {
    @Override
    public void execute(Mower mower) {
        mower.moveForward();
    }
}