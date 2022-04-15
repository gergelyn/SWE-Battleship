package model;

public class Cell {
    private final int x;
    private final int y;

    private boolean isWater;
    private boolean isShip;
    private boolean isHit;
    private boolean isMiss;
    private boolean isSunk;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.isWater = true;
        this.isShip = false;
        this.isHit = false;
        this.isMiss = false;
        this.isSunk = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isWater() {
        return isWater;
    }

    public boolean isShip() {
        return isShip;
    }

    public boolean isHit() {
        return isHit;
    }

    public boolean isMiss() {
        return isMiss;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public void setWater(boolean water) {
        isWater = water;
    }

    public void setShip(boolean ship) {
        isShip = ship;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }

    public void setMiss(boolean miss) {
        isMiss = miss;
    }

    public void setSunk(boolean sunk) {
        isSunk = sunk;
    }

    @Override
    public String toString() {
        if (isWater() && isShip() && isHit() && isSunk()) {
            return CellStatus.SUNK.getCharacter();
        } else if (isWater() && isShip() && isHit()) {
            return CellStatus.HIT.getCharacter();
        } else if (isWater() && isHit()) {
            return CellStatus.MISS.getCharacter();
        } else if (isWater() && isShip()) {
            return CellStatus.SHIP.getCharacter();
        } else if (isWater()) {
            return CellStatus.WATER.getCharacter();
        } else {
            return "";
        }
    }
}
