package DSA.TwoPointerSlidingWindow;

public class FixedWindow {

    public static int maxSubarrayOfSizeK(int[] cpuLoad, int k) {

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;

        for (int end = 0; end < cpuLoad.length; end++) {

            windowSum += cpuLoad[end];

            if (end >= k - 1) {

                maxSum = Math.max(maxSum, windowSum);

                windowSum -= cpuLoad[start];
                start++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] cpu = {2, 5, 1, 8, 2, 9, 1};

        System.out.println(maxSubarrayOfSizeK(cpu, 3));
    }
}