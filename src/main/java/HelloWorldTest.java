import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testOutput() {
        assertEquals("Hello, Jenkins + Maven!", "Hello, Jenkins + Maven!");
    }
}
