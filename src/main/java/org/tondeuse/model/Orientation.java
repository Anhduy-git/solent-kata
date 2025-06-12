package org.tondeuse.model;

/**
 * Enum represents 4 directions of the mower: North (N), South (S), East (E), West (W)
 * It has 2 methods helps to turn the mower to the left or the right
 */
public enum Orientation {
    // 4 possible directions
    N, S, E, W;

    /**
     * Rotates the current orientation 90 degrees to the right.
     *
     * @return the new orientation after a right turn
     */
    public Orientation turnRight() {
        return switch (this) {
            case N -> E;
            case S -> W;
            case E -> S;
            case W -> N;
        };
    }

    /**
     * Rotates the current orientation 90 degrees to the left.
     *
     * @return the new orientation after a left turn
     */
    public Orientation turnLeft() {
        return switch (this) {
            case N -> W;
            case S -> E;
            case E -> N;
            case W -> S;
        };
    }
}
