package silverTest;

class Coffee {
	void drip() {
		System.out.println("Coffee");
	}
}

public class CaffeMocha  extends Coffee{
	void addMilk(){
		System.out.println("CaffeMocha");
	}
    	public static void main(String[] args) {
			CaffeMocha cof = new CaffeMocha();
			cof.addMilk();
			CaffeMocha moc = (CaffeMocha) cof;
			moc.drip();
			moc.addMilk();
		}
}
