package thisisct.chapter05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Node1{

    private int x;
    private int y;

    public Node1(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public  int getY(){
        return y;
    }

}

public class java11 {

    public static int n, m;
    public static int[][] graph = new int[201][201];

    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static int bfs(int x, int y){
        Queue<Node1> q = new LinkedList<>();
        q.offer(new Node1(x, y));
        while(!q.isEmpty()){
            Node1 node = q.poll();
            x = node.getX();
            y = node.getY();
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || ny < 0 || nx >= n || ny >= m || graph[nx][ny] == 0) continue;
                if(graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new Node1(nx, ny));
                }
            }
        }
        return graph[n - 1][m - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        scanner.nextLine();

        for(int i = 0; i < n; i++){
            String str = scanner.nextLine();
            for(int j = 0; j < str.length(); j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0, 0));

    }
}
