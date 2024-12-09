import java.util.*;
public class MinimumPresses {
    public static boolean isPointInsidePolygon(int x, int y, List<Pair> polygonVertices) {
        int numVertices = polygonVertices.size();
        boolean isInside = false;
        for (int i = 0; i < numVertices; i++) {
            Pair p1 = polygonVertices.get(i);
            Pair p2 = polygonVertices.get((i + 1) % numVertices);

            if ((p1.getY() > y) != (p2.getY() > y) && x < (p2.getX() - p1.getX()) * (y - p1.getY()) / (p2.getY() - p1.getY()) + p1.getX()) {
                isInside = !isInside;
            }
        }
        return isInside;
    }
    public static int minimumPresses(List<Pair> polygonVertices, int brushSize) {
        int minX = polygonVertices.get(0).getX();
        int maxX = polygonVertices.get(0).getX();
        int minY = polygonVertices.get(0).getY();
        int maxY = polygonVertices.get(0).getY();
        for (Pair vertex : polygonVertices) {
            minX = Math.min(minX, vertex.getX());
            maxX = Math.max(maxX, vertex.getX());
            minY = Math.min(minY, vertex.getY());
            maxY = Math.max(maxY, vertex.getY());
        }
        Set<Pair> coveredPoints = new HashSet<>();
        int pressCount = 0;
        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                if (isPointInsidePolygon(x, y, polygonVertices)) {
                    boolean alreadyCovered = false;
                    for (int dx = 0; dx < brushSize; dx++) {
                        for (int dy = 0; dy < brushSize; dy++) {
                            if (coveredPoints.contains(new Pair(x + dx, y + dy))) {
                                alreadyCovered = true;
                                break;
                            }
                        }
                        if (alreadyCovered) {
                            break;
                        }
                    }
                    if (!alreadyCovered) {
                        pressCount++;
                        for (int dx = 0; dx < brushSize; dx++) {
                            for (int dy = 0; dy < brushSize; dy++) {
                                coveredPoints.add(new Pair(x + dx, y + dy));
                            }
                        }
                    }
                }
            }
        }
        return pressCount;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numVertices = scanner.nextInt();
        List<Pair> polygonVertices = new ArrayList<>();

        for (int i = 0; i < numVertices; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            polygonVertices.add(new Pair(x, y));
        }
        int brushSize = scanner.nextInt();
        int result = minimumPresses(polygonVertices, brushSize);
        System.out.println(result);
    }
    static class Pair {
        private int x;
        private int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }
        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}