package zTest;

public class InitializerClass {

	public static int foo;
	static {
		foo = PublicClassForSomeCode.Y == 0 ? 0 : PublicClassForSomeCode.X / PublicClassForSomeCode.Y;
	}
	
	public int bar() {
		return foo;
	}
}
