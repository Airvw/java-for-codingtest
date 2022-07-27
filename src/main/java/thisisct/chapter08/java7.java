package thisisct.chapter08;

import java.util.Scanner;

public class java7 {

    public static int[] dp = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for(int i = 2; i < n; i++){
            dp[i] = Math.max(dp[i - 1], arr[i] + dp[i - 2]);
        }

        System.out.println(dp[n - 1]);
    }
}
