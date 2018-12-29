package Java.JavaTrack;
public class Islands {
    private int ROW;
    private int COL;

    private boolean isSafe(int graph[][], int rowIndex, int colIndex, boolean visited[][], int current) {
        return rowIndex >= 0 && rowIndex < ROW && colIndex >= 0
                && colIndex < COL && graph[rowIndex][colIndex] == current
                && !visited[rowIndex][colIndex];
    }

    private void DFS(int graph[][], int rowIndex, int colIndex, boolean visited[][], int current) {
        int rowNbr[] = new int[]{-1, 1, 0, 0,};
        int colNbr[] = new int[]{0, 0, 1, -1};
        visited[rowIndex][colIndex] = true;
        for (int neighb = 0; neighb < 4; ++neighb) {
            if (isSafe(graph, rowIndex + rowNbr[neighb], colIndex + colNbr[neighb], visited, current)) {

                DFS(graph, rowIndex + rowNbr[neighb], colIndex + colNbr[neighb], visited, current);
            }
        }
    }

    public int countIslands(int graph[][]) {
        ROW = graph.length;
        COL = graph[0].length;
        boolean visited[][] = new boolean[ROW][COL];
        int count = 0;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (!visited[i][j]) {
                    DFS(graph, i, j, visited, graph[i][j]);
                    count++;
                }
            }
        }
        return count;

    }
}

class Test {
    public static void main(String[] args) {
        Islands islands = new Islands();
        int graph[][] = new int[][]{{5, 4, 4}, {4, 3, 4}, {3, 2, 4}, {2, 2, 2}, {3, 3, 4}, {1, 4, 4}, {4, 1, 1}};
        System.out.println(islands.countIslands(graph));
    }

}

