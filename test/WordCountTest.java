import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {

  @Test
  public void singleLetterTest() {
    Assert.assertEquals(1, new WordCount().countWords("p"));
  }

  @Test
  public void simpleSentenceTest() {
    Assert.assertEquals(4, new WordCount().countWords("Mary had a little lamb"));
  }

  @Test
  public void allStopWordsTest() {
    Assert.assertEquals(0, new WordCount().countWords("the a on off"));
  }
}
