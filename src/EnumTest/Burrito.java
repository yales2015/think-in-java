package EnumTest;

/**
 * Created by yy on 2017/12/25.
 */
public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree){
        this.degree=degree;
    }
    public String toString(){
        return "EnumTest.Burrito is "+this.degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(Spiciness.HOT));
    }
}
