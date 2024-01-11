import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordCount {

  private final String[] stopWords = {"the", "a", "on", "off"};

  public List<Long> countWords(String text) {
    List<Long> result = new ArrayList<>();

    String[] words = text.split("[^A-Za-z]");
    String[] cleanedText =
        Arrays.stream(words)
            .filter(x -> !Arrays.asList(stopWords).contains(x))
            .filter(x -> !x.isBlank())
            .toArray(String[]::new);

    System.out.println(cleanedText.toString());
    result.add(Long.valueOf(cleanedText.length));
    return result;
  }
}