package obuzye;

public class SuperHero extends Hero {
     private int hp =200;
	private boolean flying;

	public void fly(){
		this.flying = true;
		System.out.println("飛び上がった");
	}
	public void attack(Matango m){
		super.attack(m);
		if (this.flying) {
		super.attack(m);
		}
	}
	public void land(){
		this.flying = false;
		System.out.println("着地した");
	}
	public SuperHero(String name) {
            super(name);
            this.hp =getHp();
	}




	public void run(){
		System.out.println("撤退した");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}
