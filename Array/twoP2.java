/*a non-decreasing array is given return square of each element in an array in non-decreasing order.*/

public class twoP2 {
    static void reverse(int[] arr){
        int n = arr.length;
        int left = 0,right = n-1;
        for (int i = 0; i < n/2; i++) {
            int temp= arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right--;
            left++;
        } 

    }
    static int[] sortSquared(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int[] ans = new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-5,-3,-2,2,5,6};
        int[] ans = sortSquared(arr);
        reverse(ans);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
