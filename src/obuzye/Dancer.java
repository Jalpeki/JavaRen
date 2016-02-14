package obuzye;

public class Dancer implements Character{

	String name ;
	int hp;

	public void dance(){
		System.out.println(this.name + "は情熱的に踊った");
	}
	public Dancer(String name ,int hp) {
		this.name = name;
		this.hp = hp ;
	}
     public void attack(Matango m){

		System.out.println(this.name + "の攻撃");
		System.out.println("敵に３ポイントのダメージを与えた");
		m.hp -= 3;

	}
	public void run(){
		System.out.println("逃げ出した！！");

	}
	@Override
	public void attack() {
		// TODO 自動生成されたメソッド・スタブ

	}

}