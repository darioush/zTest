package zTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSomeCode {

	@Test
	public void test() {
		PublicClassForSomeCode code = new PublicClassForSomeCode();
		code.otherMethod(10, 20);
	}

}
