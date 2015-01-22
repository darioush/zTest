package zTest;

public class InitializerClass3 {
	public int x = 10;
	public int y = 0;
	public int foo;
	{
		foo = x / y;
	}
	
	public int bar() {
		return foo;
	}
}
