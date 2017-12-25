package EnumTest;

/**
 * Created by yy on 2017/12/25.
 */

enum Shrubbery {
    GROUND, CRAWLING, HANGING
}

public class EnumTest {
    public static void main(String[] args){
        for(Shrubbery s:Shrubbery.values()){
            System.out.println(s+" o rdinal: "+s.ordinal());
            System.out.println(s.compareTo(Shrubbery.CRAWLING));
            System.out.println(s==Shrubbery.CRAWLING);
            System.out.println(s.equals(Shrubbery.CRAWLING));
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
            System.out.println("==================");
        }
        for(String s:"GROUND CRAWLING HANGING".split(" ")){
            Shrubbery shrub=Enum.valueOf(Shrubbery.class,s);
            System.out.println(shrub);
            System.out.println("************");
        }
    }
}
