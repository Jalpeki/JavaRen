package obuzye;

public class PoisonMatango extends Matango{
	int poisonAttack = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}
	public void attack(Hero h) {
		super.attack(h);
	if (poisonAttack >0 ) {
		System.out.println("さらに毒の胞子をばらまいた！");
		int pa = h.getHp()/5;
		h.setHp(h.getHp() - pa );
		System.out.println(h.getName() + pa + "のダメージ");
		this.poisonAttack--;
		}
	}
}
