package construct.singleton.destory;

import construct.singleton.ic.Settings;

import java.io.*;

public class AppSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings settings = Settings.getInstance();
        Settings settings1 = null;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings) in.readObject();
        }

        System.out.println(settings == settings1);
    }
}
