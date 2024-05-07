/** A person has many shoes of different sizes, and he wants to arrange them.
 * Calculate the number of valid pairs of shoes.
 * Example 1:
 * Input: 8
 *        7L, 7R, 7L, 8L, 6R, 7R, 8R, 6R
 * Output: 3
 * */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class ValidShoePairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> store = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String shoeSize = sc.next();
            store.put(shoeSize, store.getOrDefault(shoeSize, 0) + 1);
        }

        sc.close();

        int pairs = 0;

        for (Map.Entry<String, Integer> entry : store.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();

            String opposite;
            if (key.charAt(key.length() - 1) == 'L') {
                opposite = key.substring(0, key.length() - 1) + 'R';
            } else {
                opposite = key.substring(0, key.length() - 1) + 'L';
            }

            if (store.containsKey(opposite)) {
                pairs += Math.min(val, store.get(opposite));
            }
        }

        System.out.println(pairs / 2);
    }

}