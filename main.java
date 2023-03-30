import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = new int[]{-1,0,0,3,3,3,0,0,0};
        int[] nums2 = new int[]{1,2,2};
        solution.merge(nums1,6,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
