package longserialVersionUIDtest;

import java.io.Serializable;

public class Data implements Serializable{

	// implements Serializableを記載するとWarrningが出てくるので
	// Ctrl + 1を押下し「生成シリアル・バージョンIDの追加」を選択すると
	// 勝手に番号が振られる
	private static final long serialVersionUID = -1826836446123557654L;

	private String a;

	private int b;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}