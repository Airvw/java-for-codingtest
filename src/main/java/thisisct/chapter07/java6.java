package thisisct.chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class java6 {

    public static final int MAX_VALUE = (int) 1e9;
    public static int maxVal = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m =scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        binarySearch(arr, m, 0, MAX_VALUE);

        System.out.println(maxVal);
    }


    private static void binarySearch(int[] arr, int m, int start, int end) {
        if(start > end) return;
        int mid = (start + end) / 2;
        int res = 0;
        for(int element : arr){
            if(element - mid > 0) res += element - mid;
        }
        if(res >= m){
            maxVal = mid;
            binarySearch(arr, m, mid + 1, end);
        }
        else
            binarySearch(arr, m, start, mid - 1);

    }
}
