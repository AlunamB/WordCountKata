import java.util.Arrays;

public class WordCount {

  private final String[] stopWords = {"the", "a", "on", "off"};

  public WordCountingResult countWords(String text) {
    String[] cleanedListOfWords = getCleanedListOfWords(text);
    int nrOfUniqueWords = getNumberOfUniqueWords(cleanedListOfWords);

    WordCountingResult result = new WordCountingResult(cleanedListOfWords.length, nrOfUniqueWords);
    return result;
  }

  private String[] getCleanedListOfWords(String text) {
    return Arrays.stream(getWords(text))
        .filter(x -> !Arrays.asList(stopWords).contains(x))
        .filter(x -> !x.isBlank())
        .toArray(String[]::new);
  }

  private String[] getWords(String text) {
    return text.split("[^A-Za-z]");
  }

  private int getNumberOfUniqueWords(String[] cleanedText) {
    return Arrays.stream(cleanedText).sorted().distinct().toArray().length;
  }
}