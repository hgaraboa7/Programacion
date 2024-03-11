package poo;
import java.util.Scanner;

public class borrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] grid = {
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };

        int pacmanRow = 5;
        int pacmanCol = 5;

        while (true) {
            printGrid(grid);

            System.out.println("Enter your move (W/A/S/D): ");
            char move = scanner.next().charAt(0);

            // Move Pac-Man
            if (move == 'W' && pacmanRow > 0) {
                grid[pacmanRow][pacmanCol] = ' ';
                pacmanRow--;
            } else if (move == 'A' && pacmanCol > 0) {
                grid[pacmanRow][pacmanCol] = ' ';
                pacmanCol--;
            } else if (move == 'S' && pacmanRow < 9) {
                grid[pacmanRow][pacmanCol] = ' ';
                pacmanRow++;
            } else if (move == 'D' && pacmanCol < 9) {
                grid[pacmanRow][pacmanCol] = ' ';
                pacmanCol++;
            }

            // Update Pac-Man position
            grid[pacmanRow][pacmanCol] = 'P';
        }
    }

    private static void printGrid(char[][] grid) {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

