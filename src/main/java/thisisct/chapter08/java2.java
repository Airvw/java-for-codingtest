package thisisct.chapter08;

public class java2 {

    public static long [] arr = new long[100];

    public static void main(String[] args) {

        System.out.println(fibo(50));
    }

    private static long fibo(int n) {
        if(n == 1 || n == 2) return 1;
        if(arr[n] > 0) return arr[n];

        arr[n] = fibo(n - 2) + fibo(n - 1);

        return arr[n];
    }
}
