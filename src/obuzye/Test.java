package obuzye;

public class Test {
   public static void main(String[]args){
	 SuperHero sh= new SuperHero("スーパー");

	 System.out.println(sh.getHp() + sh.getName());
	 sh.run();

	 Weapon ken = new Weapon("剣", 500);
	 System.out.println(ken.getName() + ken.getPrice());
   }
}
