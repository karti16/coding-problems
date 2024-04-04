import java.util.ArrayList;
import java.util.HashMap;

class TimeMap {

  private final HashMap<String, ArrayList<Pair<String, Integer>>> store;

  public TimeMap() {
    store = new HashMap<>();
  }

  public void set(String key, String value, int timestamp) {
    if (!store.containsKey(key)) {
      store.put(key, new ArrayList<>());
    }

    store.get(key).add(new Pair<>(value, timestamp));
  }

  public String get(String key, int timestamp) {
    if (!store.containsKey(key)) return "";
    String res = "";
    ArrayList<Pair<String, Integer>> list = store.get(key);

    int l = 0;
    int r = list.size() - 1;

    while (l <= r) {
      int m = l + (r - l) / 2;

      if (list.get(m).getTimestamp() <= timestamp) {
        res = list.get(m).getValue();
        l = m + 1;
      } else {
        r = m - 1;
      }
    }

    return res;
  }

  class Pair<A, B> {

    private final A value;
    private final B timestamp;

    Pair(A value, B timestamp) {
      this.value = value;
      this.timestamp = timestamp;
    }

    A getValue() {
      return value;
    }

    B getTimestamp() {
      return timestamp;
    }
  }
}
