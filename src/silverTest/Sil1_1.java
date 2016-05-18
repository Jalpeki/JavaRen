package silverTest;

class Sil1_1 {
	int num;
	public static void main(String[] args) {
		Sil1_1 test = new Sil1_1();
		int num = 0;
		System.out.println(num);
		test.foo();
		System.out.println(num);
		System.out.println(test.num);
	}
	void foo(){
		int num = 1 ;
		bar();
		System.out.println(num);
	}
	void bar(){
		num = 2;
	}
}
