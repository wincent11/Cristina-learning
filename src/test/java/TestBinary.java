import org.junit.Assert;
import org.junit.Test;

public class TestBinary {
    @Test
    public void testBinary(){
        Assert.assertEquals(Main.binaryToDecimal(111001),57);
    }

    @Test
    public void testBinary2() {
        Assert.assertEquals(Main.binaryToDecimal(100011),35);
    }

    @Test
    public void testBinary3() {
        Assert.assertEquals(Main.binaryToDecimal(100011),37);
    }
}
