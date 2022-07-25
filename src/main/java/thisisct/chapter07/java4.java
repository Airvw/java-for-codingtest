package thisisct.chapter07;

import java.util.Scanner;

public class java4{

    public static final int MAX_BUFFER = 1000001;
    public static int[] cntArr = new int[MAX_BUFFER];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        boolean[] result =  new boolean[m];
        boolean[] result1 = new boolean[m];
        countingSort(arr);
        for(int i = 0; i < m; i++){
            int target = scanner.nextInt();
            result[i] = binarySearch(arr, target, 0, n - 1);
            result1[i] = findTarget(target);
        }

        for(boolean flag : result){
            if(flag) System.out.print("yes ");
            else System.out.print("no ");
        }
        System.out.println();
        for(boolean flag : result1){
            if(flag) System.out.print("yes ");
            else System.out.print("no ");
        }

    }

    private static boolean findTarget(int target) {
        return cntArr[target] > 0;
    }

    private static void countingSort(int[] arr) {
        for(int element : arr){
            cntArr[element]++;
        }
    }

    private static boolean binarySearch(int[] arr, int target, int start, int end) {
        if(start > end) return false;
        int mid = (start + end) / 2;
        if(arr[mid] == target) return true;
        else if(arr[mid] > target) return binarySearch(arr, target, start, mid - 1);
        else return binarySearch(arr, target, mid + 1, end);
    }
}
