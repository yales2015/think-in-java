package EnumTest;

/**
 * Created by yy on 2017/12/25.
 */
public interface Food {
    enum Appetizer implements Food{
        SALAD,SOUP,SPRING_ROLLS;
    }
    enum MainCourse implements Food{
        LASAGNE,BURRITO,PAD_THAI;
    }
    enum Dessert implements Food{
        TIRAMISU,GELATO,FRUITE
    }
    enum Coffee implements Food{
        BLACK_COFFEE,DECAF_COFFEE,LATTE;
    }
}
