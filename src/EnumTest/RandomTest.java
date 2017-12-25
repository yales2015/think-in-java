package EnumTest;

/**
 * Created by yy on 2017/12/25.
 */
enum Activity{
    SITTING,
    DODGING,
    JUMPING,
    FALLING,
    FLYING
}
public class RandomTest {
    public static void main(String[] args) {
        for (int i=0;i<20;i++){
            System.out.println(Enums.random(Activity.class));
        }
    }
}
