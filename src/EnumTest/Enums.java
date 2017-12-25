package EnumTest;

import java.util.Random;

/**
 * Created by yy on 2017/12/25.
 */
public class Enums {
    private static Random rand=new Random(47);
    public static <T extends Enum<T>> T random(Class<T> ec){
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values){
        return values[rand.nextInt(values.length)];
    }
}
