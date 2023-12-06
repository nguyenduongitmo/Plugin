import org.junit.jupiter.api.Test;
import static org.junit.jupit
public class MyTestClassTest {

    @Test
    @DisplayName("Check correct spelling")
    public void testCheckSpellingCorrect() {
        SpellChecker spellChecker = new SpellChecker();
        assertTrue(spellChecker.checkSpelling("correct"));
    }

    @Test
    @DisplayName("Check incorrect spelling")
    public void testCheckSpellingIncorrect() {
        SpellChecker spellChecker = new SpellChecker();
        assertFalse(spellChecker.checkSpelling("incorect"));
    }

    @Test
    @DisplayName("Check empty string")
    public void testCheckSpellingEmptyString() {
        assertTrue(SpellChecker.checkSpelling(""));
    }

}