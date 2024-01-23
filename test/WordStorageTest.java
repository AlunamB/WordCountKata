import org.junit.Assert;
import org.junit.Test;

public class WordStorageTest {

  @Test
  public void getIndexSimpleTest() {
    String[] expectedIndexWords = {"had", "lamb", "little", "Mary"};
    // List<String> fruitList = Arrays.asList(fruits);

    Assert.assertEquals(
        expectedIndexWords, new WordStorage("Mary had a little lamb").getIndexList().toArray());
  }
}