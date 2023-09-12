import static org.junit.jupiter.api.Assertions.*;

import ch.plebsapps.uebungsaufgaben.pallindrom.CheckPalindrom;
import org.junit.jupiter.api.Test;

public class CheckPalindromTest {

    @Test
    public void testPalindrome() {
        // Testfälle für Palindrome
        assertTrue(CheckPalindrom.testPalindrom("otto"));
        assertTrue(CheckPalindrom.testPalindrom("Anna"));
        assertTrue(CheckPalindrom.testPalindrom("madam"));
        assertTrue(CheckPalindrom.testPalindrom("Aibohphobia"));
        assertTrue(CheckPalindrom.testPalindrom("racecar"));
    }

    @Test
    public void testNonPalindrome() {
        // Testfälle für Nicht-Palindrome
        assertFalse(CheckPalindrom.testPalindrom("hello"));
        assertFalse(CheckPalindrom.testPalindrom("world"));
        assertFalse(CheckPalindrom.testPalindrom("Java"));
        assertFalse(CheckPalindrom.testPalindrom("openai"));
        assertFalse(CheckPalindrom.testPalindrom("programming"));
    }

    @Test
    public void testEmptyString() {
        // Testfall für leere Zeichenkette
        assertTrue(CheckPalindrom.testPalindrom(""));
    }
}