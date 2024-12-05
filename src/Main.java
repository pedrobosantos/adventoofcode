import base.AdventInt;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class Main {
    public static void main(String[] args){
        String packageName = "src/advent24";
        File directory = new File("src/advent24");
        File file = Objects.requireNonNull(directory.listFiles())[7];
        if (file.getName().endsWith(".java")) {
            String className = packageName.replace("src/", "") + "." + file.getName().replace(".java", "");
            String day = String.valueOf(Integer.parseInt(className.substring(className.length() - 4, className.length() - 2)));
            String part = String.valueOf(Integer.parseInt(className.substring(className.length() - 2)));
            try {
                // Load the class dynamically
                Class<?> clazz = Class.forName(className);

                // Check if it implements MyInterface
                if (AdventInt.class.isAssignableFrom(clazz)) {
                    // Instantiate the class
                    Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
                    AdventInt advent = (AdventInt) constructor.newInstance("inputs/" + className.replace(".","/") + ".txt");
                    System.out.println("Advent Problem Day " + day + " Part " + part + " Result: " + advent.getResult());
                }
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException |
                     InvocationTargetException | InstantiationException _) {}
        }

    }
}