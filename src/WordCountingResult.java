public class WordCountingResult {
  private int countedWords;
  private int uniqueWords;

  public WordCountingResult(int countedWords, int uniqueWords) {
    setCountedWords(countedWords);
    setUniqueWords(uniqueWords);
  }

  public int getCountedWords() {
    return countedWords;
  }

  public void setCountedWords(int countedWords) {
    this.countedWords = countedWords;
  }

  public int getUniqueWords() {
    return uniqueWords;
  }

  public void setUniqueWords(int uniqueWords) {
    this.uniqueWords = uniqueWords;
  }
}