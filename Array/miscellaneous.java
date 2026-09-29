
public class miscellaneous{
    public static void main(String[] args) {
        
        int[][] a = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
                    };

        int[][] b = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                    {10, 11, 12}
                    };
        int[][] mul = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++){
                    mul[i][j] += a[i][k]*b[k][j];
                }
                
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}