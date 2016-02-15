package longserialVersionUIDtest;

import java.io.FileInputStream;

public class ObjectInputStream {
    try {
        FileInputStream fis = openFileInput("SaveData.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerializableData data = (SerializableData) ois.readObject();
        ois.close();
    } catch (Exception e) {
        Log.d(TAG, "Error");
    }
}
