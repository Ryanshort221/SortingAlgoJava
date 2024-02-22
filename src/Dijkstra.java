public class Dijkstra {
    int[][] adjacentMatrix;
    int[] distance;

    public int[] dijkstra(int[][] adjacentMatrix) {
        int v = adjacentMatrix.length;
        boolean visited[] = new boolean[v];
        distance = new int[v];
        distance[0] = 0;
        for (int i = 1; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        
        for(int i = 0; i < v - 1; i++) {
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true;
            for(int j = 0; j < v; j++) {
                if(adjacentMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {
                    int newDistance = distance[minVertex] + adjacentMatrix[minVertex][j];
                    if(newDistance < distance[j]) {
                        distance[j] = newDistance;
                    }
                }
            }
        }
        return distance;
    }

    public int findMinVertex(int[] distance, boolean visited[]) {
        int minVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
                minVertex = i;
            }
        }
        return minVertex;
    }   
}