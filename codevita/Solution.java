import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Set<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int k = scanner.nextInt();
        boolean[] active = new boolean[n];
        Arrays.fill(active, true);
        int activeCount = n;
        if (activeCount == k) {
            System.out.println(1);
            scanner.close();
            return;
        }
        int days = 0;
        while (activeCount != k) {
            boolean[] nextActive = new boolean[n];
            boolean stateChanged = false;
            for (int i = 0; i < n; i++) {
                int activeNeighbors = 0;
                for (int neighbor : graph.get(i)) {
                    if (active[neighbor]) activeNeighbors++;
                }
                if ((active[i] && activeNeighbors == 3) || (!active[i] && activeNeighbors < 3)) {
                    nextActive[i] = true;
                    if (active[i] != nextActive[i]) {
                        stateChanged = true;
                        activeCount += nextActive[i] ? 1 : -1;
                    }
                }
            }
            if (!stateChanged) {
                System.out.println("-1");
                scanner.close();
                return;
            }
            active = nextActive;
            days++;
            if (activeCount == k) {
                System.out.println(days);
                scanner.close();
                return;
            }
        }
        System.out.println(days);
        scanner.close();
    }
}