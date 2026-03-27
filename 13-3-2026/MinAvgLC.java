import java.util.Arrays;

public class MinAvgLC {
    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        
        int left = 0, right = nums.length - 1;
        double minAvg = Double.MAX_VALUE;

        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            minAvg = Math.min(minAvg, avg);
            left++;
            right--;
        }

        return minAvg;
    }

    public static void main(String[] args) {
        int[] nums = {7, 8, 3, 4, 15, 13, 4, 1};
        System.out.println(minimumAverage(nums));
    }
}