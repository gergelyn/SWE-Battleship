package model;

import java.util.ArrayList;

public class Board {

    public final int BOARD_SIZE = 10;

    private final Cell[][] cells = new Cell[BOARD_SIZE][BOARD_SIZE];

    public ArrayList<Ship> ships = new ArrayList<>();

    public Board() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                this.cells[i][j] = new Cell(i, j);
            }
        }
    }

    public Cell[][] getBoard() {
        return this.cells;
    }

    public void printBoard() {
        for (int i = 0; i < this.cells.length; i++) {
            System.out.print("\n" + " " + i + " ");
            for (int j = 0; j < this.cells.length; j++) {
                System.out.print(" " + this.cells[i][j]);
            }
        }
    }

    public void placeShip(int[] coordinates, ShipType shipType, String shipOrientation) {
        ArrayList<Cell> cells = new ArrayList<>();
        for (int i = 0; i < shipType.getShipLength(); i++) {
            if (shipOrientation.equalsIgnoreCase("vertical")) {
                this.getBoard()[coordinates[0] + i][coordinates[1]].setShip(true);
                cells.add(this.getBoard()[coordinates[0] + i][coordinates[1]]);
            } else if (shipOrientation.equalsIgnoreCase("horizontal")) {
                this.getBoard()[coordinates[0]][coordinates[1] + i].setShip(true);
                cells.add(this.getBoard()[coordinates[0]][coordinates[1] + i]);
            } else {
                System.out.println("Not vertical nor horizontal");
            }
        }

        Ship ship = new Ship(cells, shipType, this);
        this.ships.add(ship);
    }
}
