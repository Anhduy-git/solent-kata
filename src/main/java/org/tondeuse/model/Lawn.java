package org.tondeuse.model;

/**
 * Class represent a lawn and contain the information about its boundaries
 */
public class Lawn {
    private final int boundX;
    private final int boundY;

    public Lawn(int boundX, int boundY) {
        this.boundX = boundX;
        this.boundY = boundY;
    }

    /**
     * Checks if the given coordinates (x, y) are within the bounds of the lawn.
     *
     * @param x The x-coordinate to check.
     * @param y The y-coordinate to check.
     * @return true if the coordinates are within the lawn's boundaries, otherwise return false.
     */
    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x <= boundX && y >= 0 && y <= boundY;
    }
}
