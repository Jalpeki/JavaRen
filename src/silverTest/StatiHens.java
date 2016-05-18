package silverTest;


public class StatiHens {
	static int staNum = 3;

	public static void main(String[] args) {
		StatiHens test = new StatiHens();
		test.staNum++;
		StatiHens.staNum++;
		test.staNum++;
		System.out.println(StatiHens.staNum + "" + test.staNum);
	}

}
