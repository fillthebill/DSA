
import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByOne {
    /**
    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.*/
    static CharacterComparator offByOne = new OffByOne();

    static Palindrome palindrome = new Palindrome();
    /** Your tests go here.
    Uncomment this class once you've created your CharacterComparator interface and OffByOne class. */
    @Test
    public void testoffbyone() {
        assertTrue(palindrome.isPalindrome("babc",offByOne));
        assertTrue(palindrome.isPalindrome("&%",offByOne));
        assertTrue(palindrome.isPalindrome("*",offByOne));
        assertFalse(palindrome.isPalindrome("Abab",offByOne));
        assertTrue(palindrome.isPalindrome("&ab%",offByOne));
        assertTrue(palindrome.isPalindrome("&a&ba%b%",offByOne));
        assertTrue(palindrome.isPalindrome("&",offByOne));
        assertFalse(palindrome.isPalindrome("Aa",offByOne));





    }
}
