package model;

public enum CellStatus {
    WATER("W"),
    SHIP("S"),
    HIT("X"),
    MISS("O"),
    SUNK("D");

    String cellChar;

    CellStatus(String cellChar) {
        this.cellChar = cellChar;
    }

    public String getCharacter() {
        return cellChar;
    }
}
