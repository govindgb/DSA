/**
 * SearchInRotatedArray
 */
public class SearchInRotatedArray {

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int s = 0, e = nums.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            // if target is equal to mid
            if (target == nums[mid]) {
                return mid;
            }
            // firest point we observe that if the firest value is less than or equeal to
            // the
            // the mid this this array is sorted
            else if (nums[s] <= nums[mid]) {
                // we are check that if the target is lie in the range or not
                if (nums[s] <= target && nums[mid] > target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (nums[e] >= target && nums[mid] < target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target));

    }
}