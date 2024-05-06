import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HugeIntegerTest {
    @Test
    public void testThatParseMethodCanConvert() {
        HugeInteger hugeInteger = new HugeInteger();
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] actual = hugeInteger.parse("0123456789012345678901234567890123456789");
        assertArrayEquals(expected, actual);


    }

    @Test
    public void testThatToStringMethodCanConvertToString() {
        HugeInteger hugeInteger = new HugeInteger("0123456789012345678901234567890123456789");
        String expected = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]";
        String actual = hugeInteger.toString();
        assertEquals(expected, actual);


    }

    @Test
    public void testThatAddMethodCanAdd() {
        HugeInteger hugeInteger1 = new HugeInteger("0123456789012345678901234567890123456789");
        HugeInteger hugeInteger = new HugeInteger("0123456789012345678901234567890123456789");
        BigInteger expected = new BigInteger("0246913578024691357802469135780246913578");
        BigInteger actual = hugeInteger.add(hugeInteger1);
        assertEquals(expected, actual);



    }
    @Test
    public void testThatSubtractMethodCanSubtract() {
        HugeInteger hugeInteger1 = new HugeInteger("0123456789012345678901234567890123456789");
        HugeInteger hugeInteger = new HugeInteger("0123456789012345678901234567890123456789");
        BigInteger expected = new BigInteger("0");
        BigInteger actual = hugeInteger.subtract(hugeInteger1);
        assertEquals(expected, actual);
    }

}
