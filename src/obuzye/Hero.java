package obuzye;

public class Hero {
  private String name ;  //名前の宣言
  private int hp ;       //HPの宣言
   Sword sword;
   static int money;

   static void setRandomMoney(){
	   Hero.money = (int) (Math.random() * 1000);
   }
   void sleep(){
	   this.hp = 100;
	   System.out.println(this.name + "は、眠って回復した");
   }
   void sit(int sec){
	   this.hp += sec;
	   System.out.println
	               (this.name + "は、" + sec +"秒座った!");
	   System.out.println("HPが" + sec + "ポイント回復した。");
   }
   void slip(){
	   this.hp -= 5;
	   System.out.println(this.name + "は、転んだ！");
	   System.out.println("５のダメージ");
   }
   void run(){
	   System.out.println(this.name + "は逃げ出した！");
	   System.out.println("GAMEOVER");
	   System.out.println("最終HPは" + getHp() + "でした");
   }
  public void attack(Matango m){
   	System.out.println(this.name + "は攻撃した！");
    m.hp-= 5;
   	System.out.println("敵に５ポイントのダメージをあたえた！");
	System.out.println("お化けキノコ" + m.getSuffix() + "から２ポイントのダメージを受けた");
	this.hp -= 2;
if (this.hp <= 0) {
	this.die();
}
   }
    private void die(){
	   System.out.println(this.name + "は死んでしまった");
	   System.out.println("GAMEOVERです");
   }
   void bye(){
	   System.out.println("勇者は別れを告げた");
   }
   Hero(String name){
       this.hp = 100;
       this.name = name ;
   }
    Hero() {
       this( "ダミー");
   }
    Hero(String name,int hp){
    	this();
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
	if(name == null){
  throw new IllegalArgumentException("名前が空である");
	}
	if(name.length()<=1){
		throw new IllegalArgumentException("名前が短い");
	}
		this.name = name;
	}
	public int getHp() {
		return hp;
		}
	public void setHp(int hp) {
		this.hp = hp;
		}
}
