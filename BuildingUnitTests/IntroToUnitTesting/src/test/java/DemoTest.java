
import org.junit.Test;
//import main.java.Demo;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both
 * {@link Demo#main(String[])} and
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {

    @Test
    public void test_isTriangle1()
    {
        assertTrue(Demo.isTriangle(4,5,8));
    }

    @Test
    public void test_isTriangle2()
    {
        assertTrue(Demo.isTriangle(20, 15, 12));
    }

    @Test
    public void test_isTriangle3()
    {
        assertTrue(Demo.isTriangle(10, 17, 11));
    }

    @Test
    public void test_isTriangle5()
    {
        assertTrue(Demo.isTriangle(7, 5, 7));
    }

    @Test
    public void test_isTriangle6()
    {
        assertTrue(Demo.isTriangle(14, 8, 8));
    }

    @Test
    public void test_isTriangle7()
    {
        assertTrue(Demo.isTriangle(6, 6, 11));
    }

    @Test
    public void test_isNotTriangle1()
    {
        assertFalse(Demo.isTriangle(14, 5, 8));
    }

    @Test
    public void test_isNotTriangle2()
    {
        assertFalse(Demo.isTriangle(4, 17, 9));
    }

    @Test
    public void test_isNotTriangle3()
    {
        assertFalse(Demo.isTriangle(5, 7, 16));
    }

    @Test
    public void test_isNotTriangle4()
    {
        assertFalse(Demo.isTriangle(9, 4, 5));
    }

    @Test
    public void test_isNotTriangle5()
    {
        assertFalse(Demo.isTriangle(3, 9, 6));
    }

    @Test
    public void test_isNotTriangle6()
    {
        assertFalse(Demo.isTriangle(7, 7, 14));
    }

    @Test
    public void test_isNotTriangle7()
    {
        assertFalse(Demo.isTriangle(-8, 12, 6));
    }

    @Test
    public void test_isNotTriangle8()
    {
        assertFalse(Demo.isTriangle(8, -12, 6));
    }

    @Test
    public void test_isNotTriangle9()
    {
        assertFalse(Demo.isTriangle(8, 12, -6));
    }

    @Test
    public void test_isNotTriangle10()
    {
        assertFalse(Demo.isTriangle(0, 5, 7));
    }

    @Test
    public void test_isNotTriangle11()
    {
        assertFalse(Demo.isTriangle(8, 0, 7));
    }

    @Test
    public void test_isNotTriangle12()
    {
        assertFalse(Demo.isTriangle(9, 5, 0));
    }

    @Test
    public void test_isNotTriangle13()
    {
        assertFalse(Demo.isTriangle(0, 0, 0));
    }

	/*
	@Test
	public void test_main_1()
	{
		ByteArrayInputStream in = new ByteArrayInputStream("12\n15\n20\n".getBytes());
		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		//invoke
		String[] args = {};
		Demo.main(args);

		//output
		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is a triangle." + System.getProperty("line.separator");

		assertEquals(consoleOutput, out.toString());
	}

	//not triangle
	@Test
	public void test_main_2()
	{
		ByteArrayInputStream in = new ByteArrayInputStream("14\n5\n8\n".getBytes());
		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		//invoke
		String[] args = {};
		Demo.main(args);

		//output
		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

		assertEquals(consoleOutput, out.toString());
	}

	//0,0,0
	@Test
	public void test_main_3()
	{
		ByteArrayInputStream in = new ByteArrayInputStream("0\n0\n0\n".getBytes());
		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		//invoke
		String[] args = {};
		Demo.main(args);

		//output
		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

		assertEquals(consoleOutput, out.toString());
	}

	//negative values
	@Test
	public void test_main_4()
	{
		ByteArrayInputStream in = new ByteArrayInputStream("-5\n14\n4\n".getBytes());
		System.setIn(in);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		//invoke
		String[] args = {};
		Demo.main(args);

		//output
		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

		assertEquals(consoleOutput, out.toString());
	}
*/
}

