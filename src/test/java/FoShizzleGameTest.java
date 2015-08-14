import org.junit.*;
import static org.junit.Assert.*;

public class FoShizzleGameTest {

  @test
  public void foShizzle_replacesEverySInAStringWithAZ_wordChanges() {
    FoShizzleGame testFoShizzleGame = new FoShizzleGame();
    assertEquals("rozes", testFoShizzleGame.foShizzle("roses"));
  }

  @test
  public void foShizzle_doesNotReplaceFirstLetterWhenItIsAnS_firstLetterDoesntChange() {
    FoShizzleGame testFoShizzleGame = new FoShizzleGame();
    assertEquals("sunzhine", testFoShizzleGame.foShizzle("sunshine"));
  }

  @test
  public void foShizzle_replacesLettersCOrrectlyInAStringOfWords_correctsString() {
    FoShizzleGame testFoShizzleGame = new FoShizzleGame();
    assertEquals("mozez suppozez hiz toezez are rozez", testFoShizzleGame.foShizzle("moses supposes his toeses are roses"));
  }

  @test
  public void foShizzle_makesCorrectReplacesmentsRegardlessOfCase_ignoresUppercase() {
    FoShizzleGame testFoShizzleGame = new FoShizzleGame();
    assertEquals( "Mrz. McSweet'z street iz Aztoria Street!", testFoShizzleGame.foShizzle("Mrs. McSweet's street is Astoria Street!"));
  }

}
