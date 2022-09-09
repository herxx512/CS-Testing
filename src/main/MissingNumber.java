import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingNumber {

    // Project Part 1:

    public static int missingNumber(int[] nums, int maxNum) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        for (int i = 1; i <= maxNum; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public static int missingNumberSort(int[] nums, int maxNum) {
        Arrays.sort(nums);

        for (int i = 1; i < maxNum; i++) {
            if (i != nums[i - 1]) {
                return i;
            }
        }

        if (nums.length == maxNum && nums[maxNum - 1] == maxNum) {
            return 0;
        }

        return maxNum;
    }

    public static int missingNumberSum(int[] nums, int maxNum){
        int maxSum = 0;

        for (int i = 1; i <= maxNum; i++){
            maxSum += i;
        }

        int arraySum = Arrays.stream(nums).sum();

        return maxSum-arraySum;
    }

    /*
    Reflection:
    My first 2 solutions were having errors. Therefore, the provided solutions were referenced.
    However, my third solution (missingNumberSum) is similar to solution 3.
    It takes the approach of finding the maximum sum from a for loop created using the given maximum number, and
    subtract the given array sum to it to return the missing number.
    */
}
