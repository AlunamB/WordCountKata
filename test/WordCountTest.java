import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {

  @Test
  public void singleLetterTest() {
    Assert.assertEquals(1, new WordCount().countWords("p").get(0).longValue());
  }

  @Test
  public void simpleSentenceTest() {
    Assert.assertEquals(4, new WordCount().countWords("Mary had a little lamb").get(0).longValue());
  }

  @Test
  public void allStopWordsTest() {
    Assert.assertEquals(0, new WordCount().countWords("the a on off").get(0).longValue());
  }

  @Test
  public void HumptyNumberTest() {
    Assert.assertEquals(
        9,
        new WordCount()
            .countWords("Humpty-Dumpty sat on a wall. Humpty-Dumpty had a great fall.")
            .get(0)
            .longValue());
  }

  /* @Test
  public void HumptyUniqueTest() {
    Assert.assertEquals(
        7,
        new WordCount().countWords("Humpty-Dumpty sat on a wall. Humpty-Dumpty had a great fall."));
  }
  */

}