import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            list1.add(nums1[i]);
        }

        for (int num2 : nums2)
            list1.add(num2);

        Collections.sort(list1);


        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = list1.get(i);
        }
    }
}