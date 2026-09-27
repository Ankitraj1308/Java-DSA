public class sufix{
    static int totalArraySum(int[] arr){
        int totalSum = 0;
        for (int i=0;i<arr.length;i++) {
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartion(int[] arr){
        int n = arr.length;
        int prefixSum = 0;
        int totalSum = totalArraySum(arr);
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            int sufix = totalSum - prefixSum;
             if(sufix==prefixSum){
                return true;
             }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,6,3,1};
        if(equalSumPartion(arr)){
            System.out.println("Yes, it can be seperated into equal sum array.");
        }
        else{
            System.out.println("No, it can not be seperated into equal sum array.");
        }
    }
}