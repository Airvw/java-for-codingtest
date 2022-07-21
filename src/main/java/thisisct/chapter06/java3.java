package thisisct.chapter06;

public class java3 {


    public static void main(String[] args) {

        int n = 10;
        int arr[] = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

        quickSort(arr,0, n - 1);
        for(int num : arr) System.out.println(num);
    }

    private static void quickSort(int[] arr, int start, int end){
        if(start >= end) return;

        int pivot = start;
        int left = start + 1;
        int right = end;


        while(left <= right){

            while(left <= end && arr[pivot] >= arr[left] ){
                left++;
            }

            while(right > start && arr[pivot] <= arr[right]) {
                right--;
            }

            if(left > right){
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        quickSort(arr,start, right - 1);
        quickSort(arr,right + 1, end);
    }
}
