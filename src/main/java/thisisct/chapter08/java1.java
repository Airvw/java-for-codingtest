package thisisct.chapter08;

public class java1 {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    private static int fibo(int n) {
        if(n <= 2) return 1;
        return fibo(n - 2) + fibo(n - 1);
    }
}
