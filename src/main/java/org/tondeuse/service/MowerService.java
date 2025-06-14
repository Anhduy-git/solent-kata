package org.tondeuse.service;

import org.tondeuse.model.Mower;
import org.tondeuse.service.strategy.InstructionStrategy;
import org.tondeuse.service.strategy.MoveForwardInstruction;
import org.tondeuse.service.strategy.TurnLeftInstruction;
import org.tondeuse.service.strategy.TurnRightInstruction;

import java.util.Map;

/**
 * Handle the logic of execution of movement instructions for a Mower
 */
public class MowerService {

    /**
     * Map each character to an instruction
     */
    private final Map<Character, InstructionStrategy> instructionsMap = Map.of(
            'G', new TurnLeftInstruction(),
            'D', new TurnRightInstruction(),
            'A', new MoveForwardInstruction()
    );

    /**
     * Executes an instruction on the mower.
     *
     * @param mower       the current mower
     * @param instruction the instruction to be executed
     */
    public void handleInstruction(Mower mower, char instruction) {
        // Get the strategy corresponding to the current instruction
        InstructionStrategy strategy = instructionsMap.get(instruction);
        if (strategy == null) {
            throw new IllegalArgumentException("Invalid instruction: " + instruction);
        }
        strategy.execute(mower);
    }
}
