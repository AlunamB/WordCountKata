import java.util.Arrays;

public class WordCount {

  private final String[] stopWords = {"the", "a", "on", "off"};

  public int countWords(String text) {
    String[] words = text.split(" ");
    String[] cleanedText =
        Arrays.stream(words)
            .filter(x -> !Arrays.asList(stopWords).contains(x))
            .toArray(String[]::new);

    return cleanedText.length;
  }
}
