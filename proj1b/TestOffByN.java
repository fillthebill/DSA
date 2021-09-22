
import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByN {
    /**
     // You must use this CharacterComparator and not instantiate
     // new ones, or the autograder might be upset.*/
    static CharacterComparator offBy5 = new OffByN( 5);

    static Palindrome palindrome = new Palindrome();
    /** Your tests go here.
     Uncomment this class once you've created your CharacterComparator interface and OffByOne class. */
    @Test
    public void TestOffByOne() {
        assertTrue( palindrome.isPalindrome("tecr",offBy5));
        assertFalse( palindrome.isPalindrome("tech",offBy5));
        assertTrue( palindrome.isPalindrome("&&%",offBy5));
        assertTrue( palindrome.isPalindrome("&%",offBy5));
        assertTrue( palindrome.isPalindrome("*",offBy5));
    }
}



