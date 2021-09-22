
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
        assertTrue(palindrome.isPalindrome("baaaaaaaaac",offByOne));
        assertTrue(palindrome.isPalindrome("&afafafa%",offByOne));
        assertTrue(palindrome.isPalindrome("*",offByOne));
        assertFalse(palindrome.isPalindrome("faak",offByOne));
        assertTrue(palindrome.isPalindrome("&bbabb%",offByOne));


    }
}
