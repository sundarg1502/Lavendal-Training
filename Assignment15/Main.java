1) NQueens

import java.util.*;
public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        solve(0, board, result, n);
        return result;
    }
    private void solve(int row, char[][] board, List<List<String>> result, int n) {
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] r : board) {
                solution.add(new String(r));
            }
            result.add(solution);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                solve(row + 1, board, result, n);
                board[row][col] = '.';
            }
        }
    }
    private boolean isSafe(char[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }
    public static void main(String[] args) {
        NQueens nq = new NQueens();
        List<List<String>> solutions = nq.solveNQueens(4);
        for (List<String> sol : solutions) {
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}

2) RatMaze

import java.util.*;
public class RatMaze {
    public List<String> findPath(int[][] maze, int n) {
        List<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        if (maze[0][0] == 1) {
            solve(0, 0, maze, n, "", visited, paths);
        }
        return paths;
    }
    private void solve(int x, int y, int[][] maze, int n, String path, boolean[][] visited, List<String> result) {
        if (x == n - 1 && y == n - 1) {
            result.add(path);
            return;
        }
        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'};
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < n && ny < n && maze[nx][ny] == 1 && !visited[nx][ny]) {
                solve(nx, ny, maze, n, path + dir[i], visited, result);
            }
        }
        visited[x][y] = false;
    }
    public static void main(String[] args) {
        RatMaze rm = new RatMaze();
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        List<String> paths = rm.findPath(maze, 4);
        System.out.println(paths);
    }
}

3) PhoneLetterCombinations

import java.util.*;
public class PhoneLetterCombinations {
    private static final String[] KEYPAD = {
        "",     "",     "abc",  "def", "ghi",
        "jkl",  "mno",  "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        backtrack("", digits, 0, result);
        return result;
    }
    private void backtrack(String combination, String digits, int index, List<String> result) {
        if (index == digits.length()) {
            result.add(combination);
            return;
        }
        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            backtrack(combination + c, digits, index + 1, result);
        }
    }
    public static void main(String[] args) {
        PhoneLetterCombinations plc = new PhoneLetterCombinations();
        List<String> result = plc.letterCombinations("23");
        System.out.println(result);
    }
}