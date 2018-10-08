import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class StringBuildetTest {
	StringBuilder sb = null;

	@Before
	public void init() {
		sb = new StringBuilder();
	}

	@Test
	@Ignore
	public void test() {
		sb.append("Hello");
		sb.append(",");
		sb.append(" ");
		sb.append("World");
		assertEquals("Hello, World", sb.toString());

	}
	@Test
	public void test1() {
		assertEquals(0, sb.length());

	}
	
	@Test(expected=StringIndexOutOfBoundsException.class)
	public void test2() {
		sb.insert(-1, "Hi");

	}
	
	@After
	public void clear() {
		sb = null;
	}
	

}
