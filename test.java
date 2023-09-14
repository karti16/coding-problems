import java.util.HashMap;

public class test {

  public static void main(String[] args) {
    String str = "abcad";
    int k = 2;

    int ans = 0;

    if (k == 1) {
      int a = solutionForK1(str);
      System.out.println("if k = 1 : " + a);
    }

    HashMap<Character, Integer> maps = new HashMap<>();
    HashMap<Character, Integer> mapb = new HashMap<>();

    int is = -1;
    int ib = -1;
    int j = -1;

    while (true) {
      boolean f1 = false;
      boolean f2 = false;
      boolean f3 = false;

      while (ib < str.length() - 1) {
        f1 = true;
        ib++;
        char ch = str.charAt(ib);
        mapb.put(ch, mapb.getOrDefault(ch, 0) + 1);

        if (mapb.size() == k + 1) {
          ib--;
          removeInMap(mapb, ch);
          break;
        }
      }

      while (is < ib) {
        f2 = true;
        is++;
        char ch = str.charAt(is);
        maps.put(ch, maps.getOrDefault(ch, 0) + 1);

        if (maps.size() == k) {
          is--;
          removeInMap(maps, ch);
          break;
        }
      }

      while (j < is) {
        f3 = true;
        if (mapb.size() == k && maps.size() == k - 1) {
          ans += ib - is;
        }
        j++;
        char ch = str.charAt(j);
        removeInMap(maps, ch);
        removeInMap(mapb, ch);

        if (maps.size() < k - 1 || mapb.size() < k) {
          break;
        }
      }

      if (f1 == false && f2 == false && f3 == false) {
        break;
      }
    }

    System.out.println(ans);

  }

  public static int solutionForK1(String str) {
    int ans = 0;
    HashMap<Character, Integer> map = new HashMap<>();
    int i = -1;
    int j = -1;

    while (true) {
      boolean f1 = false;
      boolean f2 = false;

      while (i < str.length() - 1) {
        f1 = true;
        i++;
        char ch = str.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0) + 1);
        if (map.size() == 2) {
          removeInMap(map, ch);
          i--;
          break;
        }
      }
      while (j < i) {
        f2 = true;
        if (map.size() == 1) {
          ans += i - j;

        }
        j++;
        char ch = str.charAt(j);
        removeInMap(map, ch);

        if (map.size() == 0) {
          break;
        }
      }

      if (f1 == false && f2 == false) {
        break;
      }
    }
    return ans;
  }

  public static void removeInMap(HashMap<Character, Integer> map, char ch) {
    if (map.get(ch) == 1) {
      map.remove(ch);
    } else {
      map.put(ch, map.get(ch) - 1);
    }
  }
}
