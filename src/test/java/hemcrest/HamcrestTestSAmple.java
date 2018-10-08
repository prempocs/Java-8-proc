package hemcrest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class HamcrestTestSAmple {
	@Before
	public void setup() {

	}

	@Test
	public void test() {
		assertThat("hello", equalTo("hello"));
		assertThat("a b c",
				allOf(
						equalTo("a b c"),
						instanceOf(String.class),
						not(containsString("a b cc"))));
	}
	
	@Test
	public void collectionTest() {
		List<String> data = Arrays.asList("One","Two","Three","Four","Five");

		assertThat(data,hasItem("One"));
		assertThat(data,hasItems("One","Five"));
	}
}
