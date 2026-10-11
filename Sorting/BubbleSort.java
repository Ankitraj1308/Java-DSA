package Sorting;
public class BubbleSort{
    static void bubblesort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2,6};
        bubblesort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}