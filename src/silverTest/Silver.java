package silverTest;


public class Silver {
	public static void main(String[] args) {
		int [] i = {100,200,300,400,500};
		char c [] = new char[4];
		int j = 0;
		j += i.length;//5
		j +=c.length;//9
		System.out.println(j);
		int [][] array ={{0,1,2},{3,4,5,6}};
		System.out.println(array.length + "");
		System.out.println(array[0].getClass().isArray() +"");
		System.out.println(array[1][1]);



		boolean flag = false;
		do
			System.out.println("a");

		while (flag);
		while(flag)
			System.out.println("b"
					+ ""
					+ ""
					+ "");
	}
}
