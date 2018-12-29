
    public class Islands {

        private boolean isSafe(int graph[][], int rowIndex, int colIndex, boolean visited[][], int ROW, int COL, int current) {
            return rowIndex >= 0 && rowIndex < ROW && colIndex >= 0
                    && colIndex < COL && graph[rowIndex][colIndex] == current
                    && !visited[rowIndex][colIndex];
        }

        private void DFS(int graph[][], int rowIndex, int colIndex, boolean visited[][], int current, int ROW, int COL) {
            int rowNbr[] = new int[]{-1, 1,0,0,};
            int colNbr[] = new int[]{0, 0, 1, -1};
            visited[rowIndex][colIndex] = true;
            for (int neighb = 0; neighb < 4; ++neighb) {
                if (isSafe(graph, rowIndex + rowNbr[neighb], colIndex + colNbr[neighb], visited, ROW, COL, current)) {

                    DFS(graph, rowIndex + rowNbr[neighb], colIndex + colNbr[neighb], visited, current, ROW, COL);
                }
            }
        }

        public int countIslands(int graph[][]) {
            int ROW = graph.length;
            int COL = graph[0].length;
            boolean visited[][] = new boolean[ROW][COL];
            int count = 0;
            for (int i = 0; i < ROW; i++) {
                for (int j = 0; j < COL; j++) {
                    if (!visited[i][j]) {
                        DFS(graph, i, j, visited, graph[i][j], ROW, COL);
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

