package sample;

public class mesodTest {

	public static void main(String[] args) {
		
		
		
		
		System.out.println(calcTraianngleArea(8,6));
        System.out.println(calcCircleArea(5));
        
	
	}
	public static double calcTraianngleArea(double bottom,double height){
		double area = bottom * height / 2;
		return area ;
		 
	}
	public static double calcCircleArea(double radius ){
		double area = radius * radius * 3.14;
		return area;
		
		
	}

}
