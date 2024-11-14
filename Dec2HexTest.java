import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Dec2HexTest {
    private Dec2Hex dec2Hex;

    @Before
    public void setup() {
        dec2Hex = new Dec2Hex();  // Instantiate the Dec2Hex object
    }

    @Test // this tests a regular input
    public void TestRegularInput1() {
        String expected = "FF";
        int input = 255;

        String actualHex = dec2Hex.toHexadecimal(input);

        assertEquals(expected, actualHex);
    }

    @Test // this tests a regular input
    public void TestRegularInput2() {
        String expected = "B";
        int input = 11;

        String actualHex = dec2Hex.toHexadecimal(input);

        assertEquals(expected, actualHex);
    }

    @Test // this tests a regular input
    public void TestRegularInput3() {
        String expected = "3039";
        int input = 12345;

        String actualHex = dec2Hex.toHexadecimal(input);

        assertEquals(expected, actualHex);
    }

    @Test // this tests for if 0 is entered
    public void TestMinimumInput() {
        String expected = "0";
        int input = 0;

        String actualHex = dec2Hex.toHexadecimal(input);

        assertEquals(expected, actualHex);
    }

    @Test // this tests for the maximum number a integer can handle
    public void TestMaximumInput() {
        String expected = "7FFFFFFF";
        int input = 2147483647;

        String actualHex = dec2Hex.toHexadecimal(input);

        assertEquals(expected, actualHex);
    }

    @Test // this tests for how it handles the edges of base 16
    public void Test16Input() {
        String expected = "10";
        int input = 16;

        String actualHex = dec2Hex.toHexadecimal(input);

        assertEquals(expected, actualHex);
    }

    @Test // this tests for how it handles the edges of base 16
    public void Test256Input() {
        String expected = "100";
        int input = 256;

        String actualHex = dec2Hex.toHexadecimal(input);

        assertEquals(expected, actualHex);
    }

    @Test // this tests for how it handles the edges of base 16
    public void Test4096Input() {
        String expected = "1000";
        int input = 4096;

        String actualHex = dec2Hex.toHexadecimal(input);

        assertEquals(expected, actualHex);
    }

    @Test // this tests for how it handles the edges of base 16
    public void Test15Input() {
        String expected = "F";
        int input = 15;

        String actualHex = dec2Hex.toHexadecimal(input);

        assertEquals(expected, actualHex);
    }

//    @Test
//    public void TestStringInput() {
//        String expected = "";
//        String input = "F";
//
//        try {
//            String actualHex = dec2Hex.toHexadecimal(input);
//        } catch (Exception e) {
//            e.printStackTrace();
//            fail("Function could not handle string input");
//        }
//
//        assertEquals(expected, actualHex);
//
//    }
}
