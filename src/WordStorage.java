import java.util.Arrays;
import java.util.List;

public class WordStorage {

  private final String[] stopWords = {"the", "a", "on", "off"};
  private final String initialText;

  public WordStorage(String initialText) {
    this.initialText = initialText;
  }

  public String[] getStopWords() {
    return stopWords;
  }

  public String[] getCleanedListOfWords() {
    return Arrays.stream(getWords())
        .filter(x -> !Arrays.asList(getStopWords()).contains(x))
        .filter(x -> !x.isBlank())
        .toArray(String[]::new);
  }

  public String[] getWords() {
    return initialText.split("[^A-Za-z\\-]");
  }

  public List<String> getIndexList() {
    String[] words = getCleanedListOfWords();
    return Arrays.stream(words).sorted((o1, o2) -> o1.compareToIgnoreCase(o2)).toList();
  }
}