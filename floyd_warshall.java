public class floyd_warshall {
    public static void main (String[] args) {
        final int INF = 100000000;
        int[][] graph = {
                {0, 5, INF, 10},
                {INF, 0, 3, INF},
                {INF, -1, 0, INF},
                {INF, INF, INF, 0}
        };
        int v = graph.length;
        int[][] dist = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                dist[i][j] = graph[i][j];
            }

        }
        for(int i=0;i<v;i++)
        { if (dist[i][i] < 0) {
            System.out.println("Negative cycle detected");
            return;
        }
        }
        for(int k=0;k<v;k++)
        {
            for(int i=0;i<v;i++)
            {
                for(int j=0;j<v;j++)
                {
                    if(dist[i][k] != INF && dist[k][j] != INF && dist[i][j]>(dist[i][k]+dist[k][j]))
                    {
                        dist[i][j]=(dist[i][k]+dist[k][j]);
                    }
                }
            }
        }
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                if(dist[i][j] == INF)
                {System.out.print("INF ");}
                else
                {System.out.print(dist[i][j]+" ");}
            }
            System.out.println("");
        }

    }
}
