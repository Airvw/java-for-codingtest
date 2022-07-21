package thisisct.chapter05;

import java.util.Scanner;

public class java10 {
    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    public static boolean dfs(int x, int y){

        if(x < 0 || y < 0 || x >= n || y >= m) return false;

        if(graph[x][y] == 0){
            graph[x][y] = 1;
            dfs(x, y + 1);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x - 1, y);

            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        //버퍼 지우기
        scanner.nextLine();

        for(int i = 0; i < n; i++){
            String str = scanner.nextLine();
            for(int j = 0; j < str.length(); j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        int result = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(dfs(i, j)) result += 1;
            }
        }
        System.out.println(result);
    }
}
