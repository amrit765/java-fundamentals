/**
 * Problem:
 * Given a string of directions (N, S, E, W),
 * find the shortest path (displacement from origin).
 *
 * Example: "WNEENESENNN"
 */
public class ShortestPath {

    public static float getShortestPath(String path) {

        int x = 0, y = 0; // Starting point (0,0)

        // Traverse the path
        for (int i = 0; i < path.length(); i++) {

            char dir = path.charAt(i);

            // Update coordinates based on direction
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
        }

        /*
         * Displacement formula:
         * sqrt((x2 - x1)^2 + (y2 - y1)^2)
         * Here (x1, y1) = (0,0)
         */

        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {

        String path = "WNEENESENNN";

        float shortestPath = getShortestPath(path);

        System.out.println("Shortest Path Distance: " + shortestPath);
    }
}