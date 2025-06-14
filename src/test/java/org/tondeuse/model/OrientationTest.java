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
    void testTurnRight_fromNorth_shouldFaceEast() {
        assertEquals(Orientation.E, Orientation.N.turnRight());
    }

    @Test
    void testTurnRight_fromEast_shouldFaceSouth() {
        assertEquals(Orientation.S, Orientation.E.turnRight());
    }

    @Test
    void testTurnRight_fromSouth_shouldFaceWest() {
        assertEquals(Orientation.W, Orientation.S.turnRight());
    }

    @Test
    void testTurnRight_fromWest_shouldFaceNorth() {
        assertEquals(Orientation.N, Orientation.W.turnRight());
    }


    // -------------------------------------
    // Tests for turning LEFT
    // -------------------------------------

    @Test
    void testTurnLeft_fromNorth_shouldFaceWest() {
        assertEquals(Orientation.W, Orientation.N.turnLeft());
    }

    @Test
    void testTurnLeft_fromEast_shouldFaceNorth() {
        assertEquals(Orientation.N, Orientation.E.turnLeft());
    }

    @Test
    void testTurnLeft_fromSouth_shouldFaceEast() {
        assertEquals(Orientation.E, Orientation.S.turnLeft());
    }

    @Test
    void testTurnLeft_fromWest_shouldFaceSouth() {
        assertEquals(Orientation.S, Orientation.W.turnLeft());
    }
}
