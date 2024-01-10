import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {

  @Test
  public void singleLetterTest() {
    Assert.assertEquals(1, new WordCount().countWords("a"));
  }

  @Test
  public void simpleSentenceTest() {
    Assert.assertEquals(5, new WordCount().countWords("Mary had a little lamb"));
  }
}
