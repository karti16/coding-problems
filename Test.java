public class Test {

  public static void main(String[] args) {
    TimeMap timeMap = new TimeMap();

    timeMap.set("foo", "bar1", 1);
    timeMap.set("foo", "bar2", 2);
    timeMap.set("foo", "bar3", 7);

    System.out.println(timeMap.get("foo", 5));
  }
}
