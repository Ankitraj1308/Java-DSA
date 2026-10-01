public class maxRow {

    static void maxRow(int[][] arr) {

        int maxSum = Integer.MIN_VALUE;
        int rowNumber = -1;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                rowNumber = i;
            }
        }

        System.out.println("Row = " + (rowNumber + 1));
        System.out.println("Sum = " + maxSum);
    }

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {10, 5, 2},
            {4, 8, 1}
        };

        maxRow(arr);
    }
}

