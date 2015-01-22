package zTest;

public class InitializerClass {

	public static int foo;
	static {
		foo = PublicClassForSomeCode.X / PublicClassForSomeCode.Y;
	}
	
	public int bar() {
		return foo;
	}
}
