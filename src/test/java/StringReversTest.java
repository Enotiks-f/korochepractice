import org.example.StringReverse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringReversTest {
    private final StringReverse stringReverse = new StringReverse();

    @Test
    public void testPositive() {
        String str = "J@va the be$t!123";
        String expected = "t@eb eht av$J!123";

        String result = stringReverse.reverseLatter(str);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testEmptyString() {
        String str = "";
        String expected = "";

        String result = stringReverse.reverseLatter(str);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testOneLatter() {
        String str = "a";
        String expected = "a";

        String result = stringReverse.reverseLatter(str);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testWithoutLatter() {
        String str = "123 !@#";
        String expected = "123 !@#";

        String result = stringReverse.reverseLatter(str);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testOnlyLatter() {
        String str = "abcd";
        String expected = "dcba";

        String result = stringReverse.reverseLatter(str);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testShouldKeepNonAlphabeticCharactersInPlace () {
        String str = "12$абг%ыцы;5!";
        String expected = "12$ыцы%гба;5!";

        String result = stringReverse.reverseLatter(str);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSwapRefister () {
        String str = "12$аБг%Ыцы;5!";
        String expected = "12$ыцЫ%гБа;5!";

        String result = stringReverse.reverseLatter(str);

        Assertions.assertEquals(expected, result);
    }

}
