package org.tondeuse.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Orientation class
 */
public class OrientationTest {

    // -------------------------------------
    // Tests for turning RIGHT
    // -------------------------------------

    @Test
    void testTurnRightFromNorth() {
        assertEquals(Orientation.E, Orientation.N.turnRight());
    }

    @Test
    void testTurnRightFromEast() {
        assertEquals(Orientation.S, Orientation.E.turnRight());
    }

    @Test
    void testTurnRightFromSouth() {
        assertEquals(Orientation.W, Orientation.S.turnRight());
    }

    @Test
    void testTurnRightFromWest() {
        assertEquals(Orientation.N, Orientation.W.turnRight());
    }


    // -------------------------------------
    // Tests for turning LEFT
    // -------------------------------------

    @Test
    void testTurnLeftFromNorth() {
        assertEquals(Orientation.W, Orientation.N.turnLeft());
    }

    @Test
    void testTurnLeftFromEast() {
        assertEquals(Orientation.N, Orientation.E.turnLeft());
    }

    @Test
    void testTurnLeftFromSouth() {
        assertEquals(Orientation.E, Orientation.S.turnLeft());
    }

    @Test
    void testTurnLeftFromWest() {
        assertEquals(Orientation.S, Orientation.W.turnLeft());
    }
}
