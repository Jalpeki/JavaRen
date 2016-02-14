package longserialVersionUIDtest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Write {
	public static void main(String[] args){
		try{
			new Write().execute();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	private void execute() throws Exception{
		String file = "./test.dat";

		Data data = new Data();
		data.setA("aaa");
		data.setB(111);


		ObjectOutputStream oos =
			new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(data);

		oos.close();
	}

}