import java.util.Arrays;
public class tarDiff {
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 10};
        int target = 2;

        Arrays.sort(arr);

        int left = 0;
        int right = 1;

        while (right < arr.length) {
            int diff = arr[right] - arr[left];

            if (left == right) {
                right++;
            } else if (diff == target) {
                System.out.println(arr[left] + " " + arr[right]);
                return;
            } else if (diff < target) {
                right++;
            } else {
                left++;
            }
        }

        System.out.println("No pair found");
    }
}

