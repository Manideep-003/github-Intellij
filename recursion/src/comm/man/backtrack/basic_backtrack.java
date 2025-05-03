import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class basic_backtrack{
    // Example 1: N-Queens Problem
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        solveNQueensUtil(board, 0, solutions);
        return solutions;
    }

    private static void solveNQueensUtil(char[][] board, int col, List<List<String>> solutions) {
        if (col == board.length) {
            solutions.add(constructSolution(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solveNQueensUtil(board, col + 1, solutions);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // Check row on left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q') return false;
        }

        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check lower diagonal on left side
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    private static List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }

    // Example 2: Subsets
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrackSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrackSubsets(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrackSubsets(nums, i + 1, current, result);
            current.remove(current.size() - 1); // Backtrack
        }
    }

    // Example 3: Permutations
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrackPermute(nums, new ArrayList<>(), result);
        return result;
    }

    private static void backtrackPermute(int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i=0;i<nums.length;i++) {
            if (!current.contains(nums[i])) {
                current.add(nums[i]);
                backtrackPermute(nums, current, result);
                current.remove(current.size() - 1); // Backtrack
            }
        }
    }

    public static void main(String[] args) {
        // Test N-Queens
        System.out.println("N-Queens (n=4):");
        List<List<String>> nQueensSolutions = solveNQueens(4);
        for (List<String> solution : nQueensSolutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }

        // Test Subsets
        System.out.println("Subsets of [1,2,3]:");
        int[] nums1 = {1, 2, 3};
        List<List<Integer>> subsets = subsets(nums1);
        System.out.println(subsets);

        // Test Permutations
        System.out.println("Permutations of [1,2,3]:");
        int[] nums2 = {1, 2, 3};
        List<List<Integer>> permutations = permute(nums2);
        System.out.println(permutations);
    }
}