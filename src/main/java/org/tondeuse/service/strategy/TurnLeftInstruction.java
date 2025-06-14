package org.tondeuse.service.strategy;

import org.tondeuse.model.Mower;

/**
 * Represent an instruction for turning left.
 */
public class TurnLeftInstruction implements InstructionStrategy {
    @Override
    public void execute(Mower mower) {
        mower.turnLeft();
    }
}