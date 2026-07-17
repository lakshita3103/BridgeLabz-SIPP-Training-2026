package DSA.TwoPointerSlidingWindow;
public class PairSum {

    public static int[] findPairSum(int[] transactions, int target) {

        int left = 0;
        int right = transactions.length - 1;

        while (left < right) {

            int sum = transactions[left] + transactions[right];

            if (sum == target) {
                return new int[]{transactions[left], transactions[right]};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {1000, 5000, 12000, 18000, 32000};

        int[] ans = findPairSum(arr, 37000);

        System.out.println(ans[0] + " " + ans[1]);
    }
}