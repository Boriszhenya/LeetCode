import java.util.Arrays;

public class Aufgabe_2965 {

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        boolean[] visited = new boolean[grid.length * grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (visited[(grid[i][j] - 1)] == true) {
                    res[0] = grid[i][j];
                } else {
                    visited[(grid[i][j] - 1)] = true;
                }
            }
        }

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false) {
                res[1] = i + 1;
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3}, {2, 2}};
        int[][] grid1 = {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid1)));

    }
}
