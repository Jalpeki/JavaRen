package calcapp;

public class Calc {
	public static void main(String[] arges) {
		int a = 10;
		int b = 2;
		int total = calcapp.logics.CalcLogic.tasu(a, b);
		int delta = calcapp.logics.CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "引くと" + delta);
	}

}
