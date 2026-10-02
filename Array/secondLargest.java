public class secondLargest {

    static int findSecondLargest(int[][] arr) {

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                int value = arr[i][j];

                if (value > largest) {
                    second = largest;
                    largest = value;
                }
                else if (value > second && value != largest) {
                    second = value;
                }
            }
        }

        return second;
    }

    public static void main(String[] args) {

        int[][] arr = {
            {10, 25, 3},
            {8, 42, 15},
            {7, 12, 20}
        };

        System.out.println(findSecondLargest(arr));
    }
}

