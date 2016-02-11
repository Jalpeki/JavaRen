package obuzye;

public class Dancer extends Character{

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
}
