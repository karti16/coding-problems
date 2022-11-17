public class Java {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4}, {45, 34, 9, -1}, {34, -8, 43, 22}, {3, 5, 22, 21}};
        System.out.println(findMinNum(nums));
    }

    static int findMinNum(int[][] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] < min) {
                    min = nums[row][col];
                }
            }
        }
        return min;
    }
}