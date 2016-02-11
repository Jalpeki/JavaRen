package obuzye;

public class Wizard {
	private String name;
	private int hp;
	private int mp;
	Wand wand;

	 Wizard() {
		 this.name = "魔法使い";
		this.hp = 70;
		this.mp = 30;

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
	 if(name==null||name.length()<3){
		 throw new IllegalArgumentException("名前が異常である");
	 }
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if(hp<0){
		 this.hp = 0;
		}else{
		 this.hp = hp;
		}
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		if (mp<0) {
	throw new IllegalArgumentException("MPが異常です");
		}
		this.mp = mp;
	}
    public Wand getWand(){
    	return wand;
    }
    public  void setWand(Wand wand){
    	if(wand==null){
    	throw new IllegalArgumentException("設定されている杖がnullです");

    	}
    	this.wand = wand;
    }
	void heal(Hero h){
		int basePoint = 10;

		int recovPoint = (int)(basePoint * this.wand.getPower());

		h.setHp(h.getHp()+10) ;
		System.out.println(h.getName()+ "のHPを" + recovPoint + "回復した！	");
	}
 }
