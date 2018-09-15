package prep;
import static org.junit.Assert.*;
import org.junit.*;

public class isValidTest {
    IsValid is;
    @Before
    public void setUp(){
        is = new IsValid();
    }
    
    @Test
    public void testIsValid(){
        assertTrue(is.isValid("()"));
        assertFalse(is.isValid("(()"));
    }
}
