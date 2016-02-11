package obuzye;



public class Tennokoe {
   public static void main(String[]args) {
	  //１．勇者を生成
	   Hero h1 =new Hero("ミナト");
	   Hero h2 = new Hero();
	   King k = new King();

	   Wizard wiz = new Wizard();
	   System.out.println(wiz.getName());
	   Wand mh = new Wand();
	   System.out.println(mh.getName());
	   wiz.wand = mh;


      SuperHero dh = new SuperHero("スーパー");
     System.out.println(dh.getName());

     Dancer da = new Dancer("踊り子", 51);

     System.out.println(da.name);
     //２．フィールドに初期値をセット
   Hero.setRandomMoney();
   System.out.println(Hero.money);
     //３ キノコクラス
   Matango m =new Matango('A');
   m.hp = 50 ;

   Matango m2 = new Matango('B');
   m2.hp = 48;

   PoisonMatango m3 = new PoisonMatango('P');
System.out.println(mh.getPower());
   //冒険の始まり
   k.talk(h1);
   h1.slip();
   wiz.heal(h1);
   m.run();
   m2.run();
   h1.attack(m3);
   m3.attack(h1);
   m3.attack(h1);
   m3.attack(h1);
   m3.attack(h1);
   m3.attack(h1);
   m3.attack(h1);
   System.out.println(h1.getHp());
   h2.slip();
   dh.sit(5);
   h2.run();

   dh.run();
   }
}

