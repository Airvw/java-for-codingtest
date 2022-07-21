package thisisct.chapter05;

public class java6 {

    public static final int INF = 999999999;

    public static int[][] graph = {
            {0, 7, 5},
            {7, 0, INF},
            {5, INF ,9}
    };

    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
