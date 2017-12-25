package EnumTest;

/**
 * Created by yy on 2017/12/25.
 */
enum SecurityCategory{//枚举类的枚举
    STOCK(Security.STOCK.class),
    BOND(Security.BOND.class);
    Security[] values;
    SecurityCategory(Class<? extends Security> kind){
        values=kind.getEnumConstants();
    }
    interface Security{
        enum STOCK  implements Security{
            SHORT,LONG,MARGIN
        }
        enum BOND implements Security {
            MUNICIPAL, JUNK
        }
    }
    public Security randomSelection(){
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            SecurityCategory category=Enums.random(SecurityCategory.class);
            System.out.println(category+": "+category.randomSelection());
        }
    }
}
