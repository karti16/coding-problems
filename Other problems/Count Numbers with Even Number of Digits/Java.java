public class Java {
    public static void main(String[] args) {
        int[] nums = { 155, 24, 4, 777, 37, 4 };
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        if (nums.length == 0) {
            return count;
        }

        for (int n : nums) {
            if (isEven(n)) {
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count % 2 == 0;
    }

}