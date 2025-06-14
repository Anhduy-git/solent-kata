package org.tondeuse.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the Lawn class
 */
public class LawnTest {

    /**
     * Test when an object is within the lawn.
     */
    @Test
    void testIsWithinLawn() {
        Lawn lawn = new Lawn(3, 3);
        // Suppose that we have an object with coordinates x = 2,  y = 1
        int objectX = 2;
        int objectY = 1;
        // This object should be within the lawn
        assertTrue(lawn.isWithinBounds(objectX, objectY));
    }

    /**
     * Test when an object is outside the lawn.
     */
    @Test
    void testIsOutsideLawn() {
        Lawn lawn = new Lawn(3, 3);
        // Suppose that we have an object with coordinates x = 4,  y = 1
        int objectX = 4;
        int objectY = 1;
        // This object should be outside the lawn
        assertFalse(lawn.isWithinBounds(objectX, objectY));
    }
}
