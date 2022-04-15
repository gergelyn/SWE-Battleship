package model;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Cell> cells;
    private ShipType shipType;
    private boolean isSunk;
    private Board board;

    public Ship(ArrayList<Cell> cells, ShipType shipType, Board board) {
        this.cells = cells;
        this.shipType = shipType;
        this.isSunk = false;
        this.board = board;
    }

    public void setSunk() {
        List<Boolean> isShipHit = new ArrayList<>();
        for (Cell cell : this.cells) {
            if (cell.isWater() && cell.isShip() && cell.isHit()) {
                isShipHit.add(true);
            } else {
                isShipHit.add(false);
            }
        }
        if (isShipHit.stream().allMatch(n -> n == true)) {
            for (Cell cell : this.cells) {
                cell.setSunk(true);
            }
            this.isSunk = true;
        }
    }


}
