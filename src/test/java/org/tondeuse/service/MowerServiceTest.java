package org.tondeuse.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tondeuse.model.Mower;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

/**
 * Unit tests for the MowerController class
 */
public class MowerServiceTest {

    // Mock object mower
    private Mower mower;

    private MowerService mowerService;

    /**
     * Setups before each test so we don't need to repeat this code everytime
     */
    @BeforeEach
    void setup() {
        mower = mock(Mower.class);
        mowerService = new MowerService();
    }

    /**
     * Test when the mower controller receive the turn right instruction - D
     */
    @Test
    void testHandleInstruction_D_shouldTurnRight() {
        mowerService.handleInstruction(mower, 'D');
        verify(mower).turnRight();
    }

    /**
     * Test when the mower controller receive the turn left instruction - G
     */
    @Test
    void testHandleInstruction_G_shouldTurnLeft() {
        mowerService.handleInstruction(mower, 'G');
        verify(mower).turnLeft();
    }

    /**
     * Test when the mower controller receive the move forward instruction - A
     */
    @Test
    void testHandleInstruction_A_shouldMoveForward() {
        mowerService.handleInstruction(mower, 'A');
        verify(mower).moveForward();
    }

    /**
     * Test when the mower controller receive an invalid instruction.
     * It should print the correct message "The instruction " + instruction + " is invalid !"
     */
    @Test
    void testHandleInvalidInstruction_shouldThrowsException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> mowerService.handleInstruction(mower, 'K'));
        assertEquals("The instruction K is invalid !", exception.getMessage());
    }
}
