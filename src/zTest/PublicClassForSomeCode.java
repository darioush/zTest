package zTest;


public class PublicClassForSomeCode {
	public void someMethod() {
		System.out.println("Hello world");
	}
	
	public int otherMethod(int x, int y) {
		if (y == 0) {
			return 0;
		}
		return x / y;
	}
}

class ClassForSomeCode {
	public int otherMethod(int x, int y) {
		return x / y;
	}
}