package construct.singleton.enm;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings settings = Settings.INSTANCE;

//        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Settings settings1 = constructor.newInstance();
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
