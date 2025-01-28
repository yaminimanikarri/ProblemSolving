package problemSolvingEasy;

import java.util.HashMap;
import java.util.Map;


public class FrequencyArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println("Element" + entry.getKey() + ":" + entry.getValue() + "times");
        }
    }
}
