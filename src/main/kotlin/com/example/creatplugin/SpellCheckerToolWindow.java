import com.example.creatplugin.SpellChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpellCheckerTest {

    @Test
    public void testCheckSpellingCorrect() {
        // Test khi từ đúng về mặt chính tả
        SpellChecker spellChecker = new SpellChecker();
        boolean result = spellChecker.checkSpelling("correct");
        assertTrue(result, "'correct' should pass the spelling check");
    }

    @Test
    public void testCheckSpellingIncorrect() {
        // Test khi từ sai về mặt chính tả
        SpellChecker spellChecker = new SpellChecker();
        boolean result = spellChecker.checkSpelling("incorect");
        assertFalse(result, "'incorect' should fail the spelling check");
    }

    // Thêm các phương thức test khác nếu cần
}
