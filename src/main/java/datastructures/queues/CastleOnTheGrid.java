package datastructures.queues;

import java.util.LinkedList;
import java.util.Queue;

public class CastleOnTheGrid {

    // Complete the minimumMoves function below.
    static int minimumMoves(String[] grid, int startX, int startY, int goalX, int goalY) {
        Queue<int[]> positions = new LinkedList<>();
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        positions.add(new int[]{startX, startY});
        visited[startX][startY] = true;
        int steps = 0;
        int nToSearch;
        while (!positions.isEmpty()) {
            nToSearch = positions.size();
            for (int i = 0; i < nToSearch; i++) {
                int[] position = positions.poll();
                if (position == null) continue;
                int x = position[0];
                int y = position[1];
                if (x == goalX && y == goalY) {
                    return steps;
                }
                // up - traverse direction
                for (int j = y-1; j >= 0 && grid[x].charAt(j) != 'X'; j--) {
                    if (!visited[x][j]) {
                        positions.add(new int[]{x,j});
                        visited[x][j] = true;
                    }
                }
                // down
                for (int j = y+1; j < n && grid[x].charAt(j) != 'X'; j++) {
                    if (!visited[x][j]) {
                        positions.add(new int[]{x,j});
                        visited[x][j] = true;
                    }
                }
                // left
                for (int j = x-1; j >= 0 && grid[j].charAt(y) != 'X'; j--) {
                    if (!visited[j][y]) {
                        positions.add(new int[]{j,y});
                        visited[j][y] = true;
                    }
                }
                // right
                for (int j = x+1; j < n && grid[j].charAt(y) != 'X'; j++) {
                    if (!visited[j][y]) {
                        positions.add(new int[]{j,y});
                        visited[j][y] = true;
                    }
                }
            }
            steps++;
        }
        // trapped!
        return -1;
    }

/*    static class Pos {
        int x, y;
        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // Complete the minimumMoves function below.
    static int minimumMoves(String[] grid, int startX, int startY, int goalX, int goalY) {
        if (startX == goalX && startY == goalY) return 0;
        Queue<Pos> queue = new LinkedList<>();
        queue.offer(new Pos(startX, startY));
        int rows = grid.length, cols = grid[0].length();
        boolean[][] visited = new boolean[rows][cols];
        visited[startX][startY] = true;
        int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        int moves = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Pos cur = queue.poll();
                for (int[] dir : dirs) {
                    int x = cur.x, y = cur.y;
                    int nextX = cur.x + dir[0], nextY = cur.y + dir[1];
                    while (nextX >= 0 && nextX < rows &&
                            nextY >= 0 && nextY < cols &&
                            grid[nextX].charAt(nextY) == '.') {
                        x = nextX;
                        y = nextY;
                        if (x == goalX && y == goalY) return moves + 1;
                        if (!visited[x][y]) {
                            visited[x][y] = true;
                            queue.offer(new Pos(x, y));
                        }
                        nextX += dir[0];
                        nextY += dir[1];
                    }
                }
            }
            moves++;
        }
        return -1;
    }*/

    public static void main(String[] args) {
        String[] grid = new String[]{"abcdef"};
        int startX = 1;
        int startY = 2;
        int goalX = 3;
        int goalY = 5;
        int moves = CastleOnTheGrid.minimumMoves(grid, startX, startY, goalX, goalY);
        System.out.println("moves = " + moves);
    }
}
