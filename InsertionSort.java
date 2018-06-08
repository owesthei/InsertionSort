public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { -4, -66, 0, 4, 2, 2, 1, 55, 66 };

        showArray(nums);

        for (int i = 1; i < nums.length; i++) {
            int newValue = nums[i];

            int j = i;

            while (j > 0 && (nums[j - 1] > newValue)) {
                nums[j] = nums[j - 1];
                j--;
            }

            nums[j] = newValue;
        }

        showArray(nums);
    }

    private static void showArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
}