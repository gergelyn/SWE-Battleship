import model.*;
public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        Cell[][] cells = board.getBoard();

        for (int i = 0; i < cells.length; i++) {
            System.out.print("\n" + " " + i + " ");
            for (int j = 0; j < cells.length; j++) {
                System.out.print(" " + cells[i][j]);
            }
        }
    }
}
