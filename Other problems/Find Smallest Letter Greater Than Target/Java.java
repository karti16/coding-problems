import java.util.*;
public class Java {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'h', 'l', 'm', 'q' };
        char target = 'm';
        char result = smallestLetter(letters, target);
        System.out.println(result);
    }
    static char smallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}