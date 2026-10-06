public class prefix2d {
    static int[][] prefixSum(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j-1];
            }
        }
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                arr[i][j] += arr[i-1][j];
            }
        }
        return arr;
    }
    static int sum(int[][] arr, int l1,int l2, int r1, int r2){
        int[][] arr2 = prefixSum(arr);
        int sum=0,left=0,up=0,ans=0,upleft=0;
        sum = arr2[l2][r2];
        if(l1>=1){
            up = arr2[l1-1][r2];
        }
        if(r1>=1){
            left = arr2[l2][r1-1];
        }   
        if(l1>=1 && r1>=1){
            upleft = arr2[l1-1][r1-1];
        }
        ans = sum-up-left+upleft;
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1},
                       {1,1,1,1,1,1,1,1}, 
                    };
        System.out.println(sum(arr, 3, 5, 2, 4));
    }
}
