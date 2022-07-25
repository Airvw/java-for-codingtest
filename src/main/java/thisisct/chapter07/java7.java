package thisisct.chapter07;

import java.util.Scanner;

public class java7 {

    public static final int MAX_VALUE = (int) 1e9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(binarySearch(arr, m, 0, MAX_VALUE));

    }

    private static int binarySearch(int[] arr, int m, int start, int end) {
        int result = 0;
        while(start <= end){
            long total = 0L;
            int mid = (start + end) / 2;
            for(int element : arr){
                if(element > mid) total += element - mid;
            }
            if(total >= m){
                result = mid;
                start = mid + 1;
            }
            else
                end = mid - 1;
        }

        return result;
    }
}
