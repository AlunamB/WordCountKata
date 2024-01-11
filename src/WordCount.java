import java.util.Arrays;

public class WordCount {

  private final String[] stopWords = {"the", "a", "on", "off"};
  private final String initialText;

  public WordCount(String text) {
    initialText = text;
  }

  public WordCountingResult countWords() {
    String[] cleanedListOfWords = getCleanedListOfWords();
    int nrOfUniqueWords = getNumberOfUniqueWords(cleanedListOfWords);

    return new WordCountingResult(cleanedListOfWords.length, nrOfUniqueWords);
  }

  private String[] getCleanedListOfWords() {
    return Arrays.stream(getWords())
        .filter(x -> !Arrays.asList(stopWords).contains(x))
        .filter(x -> !x.isBlank())
        .toArray(String[]::new);
  }

  private String[] getWords() {
    return initialText.split("[^A-Za-z\\-]");
  }

  private int getNumberOfUniqueWords(String[] cleanedText) {
    return Arrays.stream(cleanedText).sorted().distinct().toArray().length;
  }

  public double getAverageWordLength() {
    String[] words = getWords();
    if (words.length == 0) {
      return 0;
    }
    double sumOfLetters = 0d;
    for (String entry : words) {
      sumOfLetters = sumOfLetters + entry.length();
    }
    return sumOfLetters / words.length;
  }
}