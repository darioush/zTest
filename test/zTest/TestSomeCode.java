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
	
	@Test
	public void testBugInnerClass() {
		PublicClassForSomeCode code = new PublicClassForSomeCode();
		PublicClassForSomeCode.InnerClass inner =  code.new InnerClass();
		
		inner.otherMethod(10, 0);
	}
	
	@Test
	public void testBugAnonInner() {
		PublicClassForSomeCode code = new PublicClassForSomeCode();
		code.anonInner(10, 0);
	}
	
	@Test
	public void testBugInitializerStatic() {
		int oldY = PublicClassForSomeCode.Y;
		PublicClassForSomeCode.Y = 0;
		new InitializerClass().bar();
		PublicClassForSomeCode.Y = oldY;
	}
	
	@Test
	public void testBugInitializerFieldStatic() {
		int oldY = PublicClassForSomeCode.Y;
		PublicClassForSomeCode.Y = 0;
		new InitializerClass2().bar();
		PublicClassForSomeCode.Y = oldY;
	}

}
