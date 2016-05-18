package silverTest;

 class Sil1_4 {
	 static int i;

	 public static void main(String[] args) {
		int i = 10;
		i = set(i);
		System.out.println(i);
		i = get();
		System.out.println(i);
		System.out.println(i);
		println();
	}
	 static
	  int set(int i){
		 i = i ;
		 return i++;
	 }
	 static int get(){
		 return i++;
	 }
	 static void println(){
		 System.out.println(i);
	 }
}
