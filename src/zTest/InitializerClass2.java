package zTest;

public class InitializerClass2 {

	public static int foo = PublicClassForSomeCode.Y == 0 ? 0 : PublicClassForSomeCode.X / PublicClassForSomeCode.Y;

		
	public int bar() {
		return foo;
	}
}
