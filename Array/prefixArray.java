public class prefixArray {
    static int[] prefixArraySum(int[] arr){
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        return prefixSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] prefixArray =prefixArraySum(arr);
        for (int i = 0; i < prefixArray.length; i++) {
            System.out.print(prefixArray[i]+" ");
        }
    }
}
