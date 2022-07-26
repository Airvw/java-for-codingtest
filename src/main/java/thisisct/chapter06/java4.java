package thisisct.chapter06;


public class java4 {

    public static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        int n = 15;
        // 모든 원소의 값이 0보다 크거나 같다고 가정
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};

        int[] cnt = new int[MAX_VALUE + 1];

        for(int num : arr){
            cnt[num]++;
        }

        for(int i = 0 ; i< MAX_VALUE; i++){
            for(int j = 0; j < cnt[i]; j++){
                System.out.print(i + " ");
            }
        }

    }
}
