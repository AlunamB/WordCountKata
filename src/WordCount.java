import java.util.Arrays;

public class WordCount {

  private WordStorage wordStorage;

  public WordCount(String text) {
    wordStorage = new WordStorage(text);
  }

  public WordCountingResult countWords() {
    String[] cleanedListOfWords = wordStorage.getCleanedListOfWords();
    int nrOfUniqueWords = getNumberOfUniqueWords(cleanedListOfWords);

    return new WordCountingResult(cleanedListOfWords.length, nrOfUniqueWords);
  }

  private int getNumberOfUniqueWords(String[] cleanedText) {
    return Arrays.stream(cleanedText).sorted().distinct().toArray().length;
  }

  public double getAverageWordLength() {
    String[] words = wordStorage.getWords();
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