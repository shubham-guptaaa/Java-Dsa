import java.util.*;
public class Plague2050O {
    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        char[][] grid = new char[n][n];
        int[] start = new int[2];
        int[] destination = new int[2];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                grid[i][j] = line.charAt(j);
                if (grid[i][j] == 's') {
                    start[0] = i;
                    start[1] = j;
                    grid[i][j] = '0';
                } else if (grid[i][j] == 'd') {
                    destination[0] = i;
                    destination[1] = j;
                    grid[i][j] = '0';
                }
            }
        }
        System.out.println(minDaysToReach(n, grid, start, destination));
    }
    private static int minDaysToReach(int n, char[][] grid, int[] start, int[] destination) {
        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(new int[]{start[0], start[1], 0});
        visited.add(start[0] + "," + start[1] + ",0");
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1], day = current[2];
            if (x == destination[0] && y == destination[1]) {
                return day;
            }
            char[][] nextGrid = computeNextGrid(n, grid);
            for (int[] dir : DIRECTIONS) {
                int nx = x + dir[0], ny = y + dir[1];
                if (isValid(nx, ny, n, nextGrid) && !visited.contains(nx + "," + ny + "," + (day + 1))) {
                    queue.add(new int[]{nx, ny, day + 1});
                    visited.add(nx + "," + ny + "," + (day + 1));
                }
            }
            if (isValid(x, y, n, nextGrid) && !visited.contains(x + "," + y + "," + (day + 1))) {
                queue.add(new int[]{x, y, day + 1});
                visited.add(x + "," + y + "," + (day + 1));
            }
            grid = nextGrid;
        }
        return -1; 
    }
    private static char[][] computeNextGrid(int n, char[][] grid) {
        char[][] nextGrid = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int infectedNeighbors = countInfectedNeighbors(i, j, n, grid);

                if (grid[i][j] == '0') {
                    nextGrid[i][j] = (infectedNeighbors == 3) ? '1' : '0';
                } else { // grid[i][j] == '1'
                    if (infectedNeighbors < 2 || infectedNeighbors > 3) {
                        nextGrid[i][j] = '0';
                    } else {
                        nextGrid[i][j] = '1';
                    }
                }
            }
        }
        return nextGrid;
    }
    private static int countInfectedNeighbors(int x, int y, int n, char[][] grid) {
        int count = 0;
        for (int[] dir : DIRECTIONS) {
            int nx = x + dir[0], ny = y + dir[1];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && grid[nx][ny] == '1') {
                count++;
            }
        }
        return count;
    }
    private static boolean isValid(int x, int y, int n, char[][] grid) {
        return x >= 0 && x < n && y >= 0 && y < n && grid[x][y] == '0';
    }
}
