import java.util.*;
public class DesertQueen {
    private static final int[][] DIR = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private static boolean isValid(int x, int y, int n, char[][] grid) {
        return x >= 0 && x < n && y >= 0 && y < n && grid[x][y] != 'M';
    }
    private static int fMW(int n, char[][] grid, int[] start, int[] end) {
        int[][] distance = new int[n][n];
        for (int[] row : distance) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);
        distance[start[0]][start[1]] = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int[] dir : DIR) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                if (isValid(nx, ny, n, grid)) {
                    int cost = (grid[x][y] == 'T' && grid[nx][ny] == 'T') ? 0 : 1;
                    if (distance[x][y] + cost < distance[nx][ny]) {
                        distance[nx][ny] = distance[x][y] + cost;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return distance[end[0]][end[1]] == Integer.MAX_VALUE ? -1 : distance[end[0]][end[1]];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] grid = new char[n][n];
        int[] start = new int[2];
        int[] end = new int[2];
        boolean foundStart = false, foundEnd = false;

        for (int i = 0; i < n; i++) {
            String row = scanner.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = row.charAt(j);
                if (grid[i][j] == 'S') {
                    start[0] = i;
                    start[1] = j;
                    foundStart = true;
                } else if (grid[i][j] == 'E') {
                    end[0] = i;
                    end[1] = j;
                    foundEnd = true;
                }
            }
        }
        if (!foundStart || !foundEnd) {
            System.out.println("Invalid grid: Missing 'S' or 'E'");
            return;
        }
        if (start[0] == end[0] && start[1] == end[1]) {
            System.out.println(0);
            return;
        }
        int result = fMW(n, grid, start, end);
        System.out.println(result == -1 ? "No Path" : result);
    }
}
