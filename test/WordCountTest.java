import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {

  @Test
  public void singleLetterTest() {
    Assert.assertEquals(1, new WordCount("p").countWords().getCountedWords());
  }

  @Test
  public void simpleSentenceTest() {
    Assert.assertEquals(4, new WordCount("Mary had a little lamb").countWords().getCountedWords());
  }

  @Test
  public void allStopWordsTest() {
    Assert.assertEquals(0, new WordCount("the a on off").countWords().getCountedWords());
  }

  @Test
  public void humptyNumberTest() {
    Assert.assertEquals(
        7,
        new WordCount("Humpty-Dumpty sat on a wall. Humpty-Dumpty had a great fall.")
            .countWords()
            .getCountedWords());
  }

  @Test
  public void humptyUniqueTest() {
    Assert.assertEquals(
        6,
        new WordCount("Humpty-Dumpty sat on a wall. Humpty-Dumpty had a great fall.")
            .countWords()
            .getUniqueWords());
  }

  @Test
  public void averageLengthOneWord() {
    Assert.assertEquals(4, new WordCount("ball").getAverageWordLength(), 0.01);
  }

  @Test
  public void averageLengthWithDigits() {
    Assert.assertEquals(3.5, new WordCount("ball out").getAverageWordLength(), 0.01);
  }

  @Test
  public void averageLengthEmptyWord() {
    Assert.assertEquals(0d, new WordCount(" ").getAverageWordLength(), 0.01);
  }

  @Test
  public void getIndexSimpleTest() {
    String[] expectedIndexWords = {"had", "lamb", "little", "Mary"};
    // List<String> fruitList = Arrays.asList(fruits);

    Assert.assertEquals(
        expectedIndexWords, new WordCount("Mary had a little lamb").getIndexList().toArray());
  }
}