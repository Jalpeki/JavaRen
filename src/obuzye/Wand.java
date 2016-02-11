package obuzye;

public class Wand {
	private String name;
	private double power;

	public String getName(){
		return name;
	}
	public void setName(String name){
		if (name==null|| name.length()<3) {
			throw new IllegalArgumentException("名前が不正です");
			}
		this.name = name;
	}

	 Wand() {
		 this.name = "魔法の杖";
		this.power = 15.5;
	}
	public double getPower(){
		return power;
	}
	public void setPower(double power){
		if ( power<0.5 || power>100.0) {
		throw new IllegalArgumentException("魔力が異常です");
		}
		this.power = power;
	}
}
