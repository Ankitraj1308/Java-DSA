public class sumSubMat {
    static void prefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] = matrix[i][j]+matrix[i][j-1];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }


    static int sum(int[][] matrix, int l1, int l2, int r1, int r2){
        prefixSumMatrix(matrix);
        int sum = 0;
        
        for (int i = l1; i <= l2; i++) {
            if(r1>0){
                sum += matrix[i][r2]-matrix[i][r1-1];
            }else{
                sum += matrix[i][r2];
            }
        }
       
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix= {{1,1,1,1,1,1,1},
                         {1,1,1,1,1,1,1},
                         {1,1,1,1,1,1,1},
                         {1,1,1,1,1,1,1},
                         {1,1,1,1,1,1,1},
                         {1,1,1,1,1,1,1},
                         {1,1,1,1,1,1,1}
                        };
        System.out.println(sum(matrix,3,5,1,4));
    }
}
