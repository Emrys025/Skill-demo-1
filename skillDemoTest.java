import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
    @Test
    public void printNumberTest() {
        assertEquals("The number is 6666", skillDemo.printNumber(6666));
    }
}
