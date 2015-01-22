package zTest;

public class InitializerClass4 {
	public int x = 10;
	public int y = 0;
	public int foo = y == 0 ? 0 : x / y;

	public int bar() {
		return foo;
	}
}
