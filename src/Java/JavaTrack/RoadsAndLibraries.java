package Java.JavaTrack;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RoadsAndLibraries {

    static void DFS(int[][] graph, int i, int n, int[] visited){
        System.out.println(i);
        visited[i]=1;
        for (int j = 0; j < n; j++){
            if(visited[j]==0 && graph[i][j]==1){
                DFS(graph, j, n, visited);
            }
        }


    }

    static long getTotalCost(int n, int c_lib, int c_road, int[][] cities) {
        int[][] adjacencyMatrix = new int[n][n];
        int[] visited = new int[n];
        int connectedComponents = 0;
        int total = 0;
        if (c_road >= c_lib){ // optimal scenario
            total = c_lib*n;
            return total;
        }
        for (int i = 0; i < cities.length; i++){
            int[] updateValues = cities[i];
            adjacencyMatrix[updateValues[0]-1][updateValues[1]-1]=1;
        }
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++){
            if (visited[i]==0){
                DFS(adjacencyMatrix, i, n,visited);
                connectedComponents++;
            }
        }
        System.out.println("connected: " + connectedComponents);
        return (long) c_road * (n - connectedComponents) + (long) connectedComponents * c_lib;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nmC_libC_road = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmC_libC_road[0]);

            int m = Integer.parseInt(nmC_libC_road[1]);

            int c_lib = Integer.parseInt(nmC_libC_road[2]);

            int c_road = Integer.parseInt(nmC_libC_road[3]);

            int[][] cities = new int[m][2];

            for (int i = 0; i < m; i++) {
                String[] citiesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int citiesItem = Integer.parseInt(citiesRowItems[j]);
                    cities[i][j] = citiesItem;
                }
            }

            long result = getTotalCost(n, c_lib, c_road, cities);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
