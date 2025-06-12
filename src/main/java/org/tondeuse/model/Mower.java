package org.tondeuse.model;

/**
 * Class represent a mower and contain the mower's information: its coordinates (x, y),
 * its current orientation, and the lawn that it operates on.
 */
public class Mower {
    private int x;
    private int y;
    private final Lawn lawn;
    private Orientation orientation;


    public Mower(int x, int y, Lawn lawn, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.lawn = lawn;
        this.orientation = orientation;
    }

    /**
     * Move the mower forward from its current orientation
     */
    public void moveForward() {
        // pre-calculate the new coordinates of the mower, so we know if it's still within the lawn's
        // boundaries or not if after the move
        int newX = x;
        int newY = y;
        switch (this.orientation) {
            case N -> newY++;
            case S -> newY--;
            case E -> newX++;
            case W -> newX--;
        }
        // If it's still within the lawn's boundaries, we can perform the move and update its current coordinates
        if (lawn.isWithinBounds(newX, newY)) {
            x = newX;
            y = newY;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
