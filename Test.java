import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    List<String> res = new ArrayList<>();
    String[] words = { "This", "is", "an", "example", "of", "text", "justification." };

    int i = 0;
    int maxWidth = 16;
    int len = 0;
    List<String> line = new ArrayList<>();

    while (i < words.length) {

      if (len + line.size() + words[i].length() > maxWidth) {

        int extra_space = maxWidth - len;
        int space = extra_space / Math.max(line.size() - 1, 1);
        int remainder = extra_space % Math.max(line.size() - 1, 1);

        for (int j = 0; j < Math.max(line.size() - 1, 1); j++) {
          String temp = line.get(j) + " ".repeat(space);
          line.set(j, temp);
          if (remainder > 0) {
            line.set(j, line.get(j) + " ");
            remainder -= 1;
          }
        }
        res.add(String.join("", line));
        line.clear();
        len = 0;
      }

      line.add(words[i]);
      len += words[i].length();
      i += 1;

    }

    String lastLine = String.join(" ", line);
    int trailSpace = maxWidth - lastLine.length();
    res.add(lastLine + " ".repeat(trailSpace));

    for (String s : res) {
      System.out.println(s);
    }

  }

}
