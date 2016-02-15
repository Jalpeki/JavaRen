package longserialVersionUIDtest;

import java.io.FileOutputStream;

public class ObjectOutputStream {
    SerializableData data = new SerializableData();
    data.setString(editTextString_.getText().toString());
    data.setNumber(Integer.parseInt(editTextNumber_.getText().toString()));
    try {
        FileOutputStream fos = openFileOutput("SaveData.dat", MODE_PRIVATE);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(data);
        oos.close();
    } catch (Exception e) {
        Log.d(TAG, "Error");
    }
}
