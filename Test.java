import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
    HashMap<String, List<String>> map = new HashMap<>();
    List<List<String>> res = new ArrayList<>();
    for (String s : strs) {
      String sortedWord = sortString(s);
      if (!map.containsKey(sortedWord)) {
        map.put(sortedWord, new ArrayList<>());
      }
      map.get(sortedWord).add(s);
    }

    res.addAll(map.values());

    System.out.println(res);
  }

  public static String sortString(String s) {
    char[] temp_s = s.toCharArray();
    Arrays.sort(temp_s);
    return new String(temp_s);
  }
}