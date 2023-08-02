package construct.singleton.destory;

import construct.singleton.ic.Settings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AppReflc {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings = Settings.getInstance();

        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings1 = constructor.newInstance();
        System.out.println(settings == settings1);
    }
}
