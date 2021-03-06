public class CheckersGame {
    private char[][] board;         // The board will be a 2D array, where character represents what is in a space. ' ' means it's empty,
    private int blackPieces;        // 'b' and 'r' are for regular pieces for black and red, while 'B' and 'R' are the kings.
    private int redPieces;

    // Constructor
    public CheckersGame() {
        board = new char[8][8];
        newBoard();
        blackPieces = 12;
        redPieces = 12;
    }

    // Methods
    /**
     * Populates the board as if it were a new Checkers game.
     */
    public void newBoard() {
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                board[0][i] = 'b';
                board[1][i] = ' ';
                board[2][i] = 'b';
                board[5][i] = ' ';
                board[6][i] = 'r';
                board[7][i] = ' ';
            } else {
                board[0][i] = ' ';
                board[1][i] = 'b';
                board[2][i] = ' ';
                board[5][i] = 'r';
                board[6][i] = ' ';
                board[7][i] = 'r';
            }
            board[3][i] = ' ';
            board[4][i] = ' ';
        }
    }

    /**
     * Prints the current status of the board in a viewable layout, including borders and coordinates.
     */
    public void printBoard() {
        boolean firstRow = true;
        System.out.print("     ");
        for (int i = 1; i <= 8; i++) {
            System.out.printf("%d     ", i);
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            if (firstRow) {
                firstRow = false;
                System.out.print("  ");
                for (int n = 0; n < 49; n++) {
                    System.out.print('-');
                }
                System.out.println();
            }
            boolean firstColumn = true;
            printRowCoordinate(i);
            for (int j = 0; j < 8; j++) {
                if (firstColumn) {
                    firstColumn = false;
                    System.out.print("|");
                }
                System.out.print("  " + board[i][j] + "  |");
            }
            System.out.println();
            System.out.print("  ");
            for (int n = 0; n < 49; n++) {
                System.out.print('-');
            }
            System.out.println();
        }
    }

    // Getter/Setter functions
    public char[][] getBoard() {
        return board;
    }

    public int getBlackPieces() {
        return blackPieces;
    }

    public int getRedPieces() {
        return redPieces;
    }

    public void setBoard(char[][] newBoard) {
        board = newBoard;
    }

    public void setBlackPieces(int newBlackPieces) {
        blackPieces = newBlackPieces;
    }

    public void setRedPieces(int newRedPieces) {
        redPieces = newRedPieces;
    }

    // Helper functions
    private void printRowCoordinate(int rowNum) {
        char rowChar = (char)(rowNum + 65);
        System.out.printf("%c ", rowChar);
    }
}
