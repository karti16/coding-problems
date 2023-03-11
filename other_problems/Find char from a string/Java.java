
public class Java {
    public static void main(String[] args) {
        String name = "karthik";
        char target = 't';
        int index = findChar(name, target);
        System.out.println(index);
        System.out.println(findChar1(name, target));
    }

    static int findChar(String name, char target) {
        if (name.length() == 0) {
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    static boolean findChar1(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (char ch : name.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }
        return false;
    }
}