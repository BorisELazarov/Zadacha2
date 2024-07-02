import junit.framework.TestCase;
import org.junit.Test;

public class TestModel extends TestCase {
    @Test
    public void TestGreaterThan0()
    {
        Model model=new Model(-3);
        assertTrue(model.getNumber()>0);
    }
}
