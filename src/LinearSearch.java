public class LinearSearch {

    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        System.out.println(obj.linearSearch(arr, -4));
    }

    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
