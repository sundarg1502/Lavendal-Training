Breadth First Search (BFS):

import java.util.*;

public class Main
{
     public static List<Integer> bfsTraversal(List<List<Integer>> adj) {
        List<Integer> bfsResult = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfsResult.add(node);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        return bfsResult;
    }
	public static void main(String[] args) {
	 List<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList(1, 2));        
        adj.add(Arrays.asList(0, 2, 3));    
        adj.add(Arrays.asList(0, 1, 4));     
        adj.add(Arrays.asList(1, 4));        
        adj.add(Arrays.asList(2, 3));       

        System.out.println("BFS Traversal: " + bfsTraversal(adj));
	}
}


Depth First Search(DFS):

import java.util.*;

public class Main
{
  public static List<Integer> dfsTraversal(List<List<Integer>> adj) {
        List<Integer> dfsResult = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];

        dfsHelper(0, adj, visited, dfsResult);

        return dfsResult;
    }

    private static void dfsHelper(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> result) {
        visited[node] = true;
        result.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, adj, visited, result);
            }
        }
    }
	public static void main(String[] args) {
	 List<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList(1, 2));        
        adj.add(Arrays.asList(0, 2, 3));    
        adj.add(Arrays.asList(0, 1, 4));     
        adj.add(Arrays.asList(1, 4));        
        adj.add(Arrays.asList(2, 3));       

        System.out.println("BFS Traversal: " + dfsTraversal(adj));
	}
}
