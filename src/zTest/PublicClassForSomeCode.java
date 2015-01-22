package zTest;


public class PublicClassForSomeCode {

	public static int X = 10;
	public static int Y = 10;

	public void someMethod() {
		System.out.println("Hello world");
	}
	
	public int otherMethod(int x, int y) {
		if (y == 0) {
			return 0;
		}
		return x / y;
	}
	
	static class StaticInnerClass {
		public int otherMethod(int x, int y) {
			if (y == 0) {
				return 0;
			}
			return x / y;
		}	
	}
	
	class InnerClass {
		public int otherMethod(int x, int y) {
			if (y == 0) {
				return 0;
			}
			return x / y;
		}
	}
	
	public void anonInner(final int x, final int y) {
		new StaticInnerClass() { 
			@Override
			public int otherMethod(int x, int y) {
				if (y == 0) {
					return 0;
				}
				return x / y;
			}
		}.otherMethod(x, y);
	}
}

class ClassForSomeCode {
	public int otherMethod(int x, int y) {
		if (y == 0) {
			return 0;
		}
		return x / y;
	}
}