import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {

  @Test
  public void singleLetterTest() {
    Assert.assertEquals(1, new WordCount().countWords("p").getCountedWords());
  }

  @Test
  public void simpleSentenceTest() {
    Assert.assertEquals(4, new WordCount().countWords("Mary had a little lamb").getCountedWords());
  }

  @Test
  public void allStopWordsTest() {
    Assert.assertEquals(0, new WordCount().countWords("the a on off").getCountedWords());
  }

  @Test
  public void humptyNumberTest() {
    Assert.assertEquals(
        7,
        new WordCount()
            .countWords("Humpty-Dumpty sat on a wall. Humpty-Dumpty had a great fall.")
            .getCountedWords());
  }

  @Test
  public void humptyUniqueTest() {
    Assert.assertEquals(
        6,
        new WordCount()
            .countWords("Humpty-Dumpty sat on a wall. Humpty-Dumpty had a great fall.")
            .getUniqueWords());
  }

  @Test
  public void averageLengthOneWord() {
    Assert.assertEquals(4, new WordCount().getAverageWordLength("ball"), 0.01);
  }

  @Test
  public void averageLengthWithDigits() {
    Assert.assertEquals(3.5, new WordCount().getAverageWordLength("ball out"), 0.01);
  }

  @Test
  public void averageLengthEmptyWord() {
    Assert.assertEquals(0d, new WordCount().getAverageWordLength(" "), 0.01);
  }
}