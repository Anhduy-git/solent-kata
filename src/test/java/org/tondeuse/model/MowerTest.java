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
    void testMoveForward_fromNorthOrientationWithinLawn_shouldMove() {
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
    void testMoveForward_fromNorthOrientationOutsideLawn_shouldNotMove() {
        Lawn lawn = new Lawn(4, 4);
        Mower mower = new Mower(3, 4, lawn, Orientation.N);
        mower.moveForward();
        // After the move the y-coordinates shouldn't change because it will be outside the lawn.
        assertEquals(4, mower.getY());
        assertEquals(3, mower.getX());
    }

    /**
     * Test the forward movement of a mower when facing West (within the lawn's boundaries).
     */
    @Test
    void testMoveForward_fromWestOrientationWithinLawn_shouldMove() {
        Lawn lawn = new Lawn(4, 4);
        Mower mower = new Mower(2, 1, lawn, Orientation.W);
        mower.moveForward();
        // After the move the x-coordinate should decrease by 1 and the y-coordinate should remain unchanged.
        assertEquals(1, mower.getY());
        assertEquals(1, mower.getX());
    }

    /**
     * Test the forward movement of a mower when facing West (outside the lawn's boundaries).
     */
    @Test
    void testMoveForward_fromWestOrientationOutsideLawn_shouldNotMove() {
        Lawn lawn = new Lawn(4, 4);
        Mower mower = new Mower(0, 2, lawn, Orientation.W);
        mower.moveForward();
        // After the move the x-coordinates shouldn't change because it will be outside the lawn.
        assertEquals(2, mower.getY());
        assertEquals(0, mower.getX());
    }

}
