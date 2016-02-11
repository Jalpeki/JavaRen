package obuzye;

public class Matango {
	int hp = 50;
	private char suffix;

	void run(){
		System.out.println
		            ("お化けキノコ" + this.suffix + "は逃げ出した");
	}
	public Matango(char suffix){
		this.suffix = suffix;
	}
	public void attack(Hero h){
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("１０のダメージ");
		h.setHp(h.getHp() - 10);

	}

	public char getSuffix() {
		return suffix;
	}
	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}
}
