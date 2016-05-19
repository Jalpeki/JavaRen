package silverTest;


public class Retest {
	int num = 5;
	public static void main(String[] args) {
		int num  = 10;
		calc(num,num);
		System.out.println(num);
	}

	public static int calc(int num1 , int num2){
		int num = num1 + num2 ;
		return num;
	}
}
