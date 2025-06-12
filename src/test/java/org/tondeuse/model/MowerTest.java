package org.tondeuse.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Mower class
 */
public class MowerTest {

    /**
     * Test the forward movement of a mower when facing North (within the lawn's boundaries).
     */
    @Test
    void testMoveForwardFromNorthOrientationWithinLawn() {
        Lawn lawn = new Lawn(4, 4);
        Mower mower = new Mower(2, 1, lawn, Orientation.N);
        mower.moveForward();
        // After the move the y-coordinate should increase by 1 and the x-coordinate should remain unchanged.
        assertEquals(2, mower.getY());
        assertEquals(2, mower.getX());
    }

    /**
     * Test the forward movement of a mower when facing North (outside the lawn's boundaries).
     */
    @Test
    void testMoveForwardFromNorthOrientationOutsideLawn() {
        Lawn lawn = new Lawn(4, 4);
        Mower mower = new Mower(3, 4, lawn, Orientation.N);
        mower.moveForward();
        // After the move the y-coordinates shouldn't change because it will be outside the lawn.
        assertEquals(4, mower.getY());
        assertEquals(3, mower.getX());
    }

}
