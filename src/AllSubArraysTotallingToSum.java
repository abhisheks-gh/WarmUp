/** Given an array of integer nums and an integer sum, return the total number
 * of sub-arrays whose sum equals to sum.
 * Example 1:
 * Input: [3, 4, -7, 1, 3, 3, 1, 4]
 * Output: [3, 4],
 *         [3, 4, -7, 1, 3, 3],
 *         [1, 3, 3],
 *         [3, 3, 1]
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class AllSubArraysTotallingToSum {

    public static void main(String[] args) {
        AllSubArraysTotallingToSum obj = new AllSubArraysTotallingToSum();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int sum = sc.nextInt();

        sc.close();

        List<ArrayList<Integer>> list = obj.allSubArraysTotallingToSum(size, nums, sum);
        System.out.println(list);
    }

    List<ArrayList<Integer>> allSubArraysTotallingToSum(int size, int[] nums, int sum) {
        int currentSum = 0;

        Map<Integer, List<Integer>> mp = new HashMap<>();

        // Initialize the map with prefix sum 0
        mp.put(0, new ArrayList<>());
        mp.get(0).add(-1);

        List<ArrayList<Integer>> subArray = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (mp.containsKey(currentSum - sum)) {
                for (int idx : mp.get(currentSum - sum)) {
                    ArrayList<Integer> subList = new ArrayList<>();
                    for (int j = idx + 1; j <= i; j++) {
                        subList.add(nums[j]);
                    }

                    subArray.add(subList);
                }
            }

            // Add current sum and its index to the map
            if (!mp.containsKey(currentSum)) {
                mp.put(currentSum, new ArrayList<>());
            }
            mp.get(currentSum).add(i);
        }

        return subArray;
    }

}
