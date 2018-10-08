import static org.junit.Assert.assertSame;

import java.lang.reflect.Member;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.omg.CORBA.StringHolder;

@RunWith(Parameterized.class)
public class ParameterizedTestCaseSample {
	String email;
	boolean expected;
	StringHolder sh = new StringHolder();
	
	public ParameterizedTestCaseSample(String email,boolean expected) {
		this.email = email;
		this.expected = expected;
	}
	@Parameters
	public static List<Object[]> getParams() {
		return Arrays.asList(new Object[][] {
			{true,null},
			{true,""},
			{true,"p.w@h.c"},
			{false, "yy"}
			
		});
	}
	
	@Test
	public static void tesEmail() {
		//assertSame(expected, MemberValidator);MemberValidator
	}
	
}
