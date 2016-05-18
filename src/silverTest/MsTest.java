package silverTest;


public class MsTest {
	void foo(int i){
		System.out.println("one");
	}
	void foo(String s){
		System.out.println("two");
	}
	void foo(double d){
		System.out.println("three");
	}
	public static void main(String[] args) {
		new MsTest().foo(2.0);
	}
}
