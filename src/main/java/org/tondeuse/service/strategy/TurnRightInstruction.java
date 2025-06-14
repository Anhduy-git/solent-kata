package org.tondeuse.service.strategy;

import org.tondeuse.model.Mower;

/**
 * Represent an instruction for turning right.
 */
public class TurnRightInstruction implements InstructionStrategy {
    @Override
    public void execute(Mower mower) {
        mower.turnRight();
    }
}