import static org.junit.Assert.*;
import org.junit.*;

public class skilltest1tester extends skilltest1{
    @Test
    public void multiply() {
        assertEquals(5, multiply(2, 3));
    }
}