package thisisct.chapter07;

import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(binarySearch(arr, target, 0, n - 1));
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while(start < end){
            int mid = (start + end) / 2;
            if(arr[mid] == target) return mid + 1;
            else if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
     }

}
