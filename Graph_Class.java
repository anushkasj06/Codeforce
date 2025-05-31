import java.util.Scanner;

public class Graph_Class {
    int v, visited[], g[][];

    // Constructor
    Graph_Class(int nodes) {
        v = nodes;
        Scanner in = new Scanner(System.in);
        g = new int[v][v]; // adjacency matrix
        visited = new int[v]; // visited array

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.println("Enter value for v" + i + " to v" + j + " (999 for infinity):");
                g[i][j] = in.nextInt();
            }
        }
    }

    void printG() {
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(g[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void resetVisited() {
        for (int i = 0; i < v; i++) {
            visited[i] = 0; // unvisited
        }
    }

    public void DFS(int source) {
        visited[source] = 1;
        System.out.println("V" + source);

        for (int i = 0; i < v; i++) {
            if (g[source][i] == 1 && visited[i] != 1) {
                DFS(i);
            }
        }
    }

    public void BFS(int source) {
        int[] q = new int[v];
        int front = 0, rear = -1;
        visited[source] = 1;
        q[++rear] = source; // enqueue

        while (front <= rear) {
            int element = q[front++]; // dequeue
            System.out.println("V" + element);

            for (int i = 0; i < v; i++) {
                if (g[element][i] == 1 && visited[i] != 1) {
                    visited[i] = 1; // mark visited
                    q[++rear] = i; // enqueue
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int nodes = sc.nextInt();

        Graph_Class obj = new Graph_Class(nodes);
        obj.printG();

        obj.resetVisited();
        System.out.println("\nDFS traversal from node 0:");
        obj.DFS(0);

        obj.resetVisited();
        System.out.println("\nBFS traversal from node 0:");
        obj.BFS(0);
    }
}
