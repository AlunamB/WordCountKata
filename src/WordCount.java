import java.util.Arrays;

public class WordCount {

  private final String[] stopWords = {"the", "a", "on", "off"};

  public WordCountingResult countWords(String text) {
    String[] words = text.split("[^A-Za-z]");
    String[] cleanedText =
        Arrays.stream(words)
            .filter(x -> !Arrays.asList(stopWords).contains(x))
            .filter(x -> !x.isBlank())
            .toArray(String[]::new);

    WordCountingResult result = new WordCountingResult(cleanedText.length, 0);
    return result;
  }
}