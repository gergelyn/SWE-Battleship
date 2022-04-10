package model;

public enum ShipType {
    DESTROYER(2),
    SUBMARINE(3),
    CRUISER(3),
    BATTLESHIP(4),
    CARRIER(5);

    int shipLength;

    ShipType(int shipLength) {
        this.shipLength = shipLength;
    }

    public int getShipLength() {
        return shipLength;
    }
}
