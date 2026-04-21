public class Main {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1)); // true
        System.out.println(isValidMove(3, 0)); // false (out of bounds)

        board[1][1] = 'X';
        System.out.println(isValidMove(1, 1)); // false (already filled)
    }

    // UC5: Validate move
    static boolean isValidMove(int row, int col) {

        // 1. Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // 2. Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}