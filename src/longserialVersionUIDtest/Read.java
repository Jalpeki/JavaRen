package longserialVersionUIDtest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Read {
	public static void main(String[] args) {
		try {
			new Read().execute();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void execute() throws Exception {
		String file = "./test.dat";

		ObjectInputStream ois =
			new ObjectInputStream(new FileInputStream(file));

		Data data = (Data)ois.readObject();

		System.out.println(data.getA());
		System.out.println(data.getB());

		ois.close();
	}

}