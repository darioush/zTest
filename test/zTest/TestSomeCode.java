package zTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSomeCode {

	@Test
	public void test() {
		PublicClassForSomeCode code = new PublicClassForSomeCode();
		code.otherMethod(10, 20);
	}
	
	@Test
	public void testBug() {
		PublicClassForSomeCode code = new PublicClassForSomeCode();
		code.otherMethod(10, 0);
	}
	
	@Test
	public void testBugNopubClass() {
		ClassForSomeCode code = new ClassForSomeCode();
		code.otherMethod(10, 0);
	}


	@Test
	public void testBugInnerStaticClass() {
		PublicClassForSomeCode.StaticInnerClass code = new PublicClassForSomeCode.StaticInnerClass();
		code.otherMethod(10, 0);
	}
}
