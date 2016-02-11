package obuzye;

public class Cleric {
   String name;
   int hp = 50;
   static final int MAX_HP = 50;
   int mp = 10;
   static final int MAX_MP = 10;

   void selfAid(){
     this.mp  -= 5;
     this.hp = this.MAX_HP ;
     System.out.println
           (this.name + "は、HPを回復した。");
   }
   public int pray(int sec){
	 int rec = new java.util.Random().nextInt(3) +sec;
	 int rt = Math.min(this.MAX_MP - this.mp, rec);
	  this.mp +=rt;
	  System.out.println("MPが" + rt +"回復した");
	  return rt;
   }
   public Cleric(String name,int hp,int mp) {
	this.name = name; 
	this.hp = hp;
	this.mp = mp; 
   }
   public Cleric(String name, int hp) {
	this(name,hp,Cleric.MAX_MP);
   }
   public Cleric(String name){
	this(name, MAX_HP);
   }
}
