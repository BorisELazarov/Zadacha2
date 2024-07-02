package testModels;

import junit.framework.TestCase;
import models.Example;
import org.junit.Test;


public class ExampleTest extends TestCase {
    @Test
    public void TesIfStringEmpty()
    {
        Example example=new Example("Property");
        assertNotSame("",example.getProp()=="");
    }
}
