package problemSolvingEasy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lonelyelements {
    public static void main(String[] args) {
        int nums[] = {10, 6, 5, 8,10,14,13};
        System.out.println(Lonelyelements(nums));

    }

    public static List<Integer> Lonelyelements(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); // empty  (10,2), (6,1) , (5,1 ) , (8,1 ), (14,1)
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1); //
            } else {
                hm.put(nums[i], 1); // 10, 1
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (hm.get(nums[i]) == 1 && !hm.containsKey(nums[i] + 1) && !hm.containsKey(nums[i] - 1)) {
                result.add(nums[i]);
            }
        }
        return result;
    }
}
