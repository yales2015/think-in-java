package EnumTest;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by yy on 2017/12/25.
 */

enum Explorer{
    HERE,THERE
}
class Reflection1 {
    public static Set<String> analyze(Class<?> enumClass){
        System.out.println("------analyzing "+enumClass+" -----");
        System.out.println("Interface:");
        for (Type t:enumClass.getGenericInterfaces()){//获取实现的接口
            System.out.println(t);
        }
        System.out.println("Base: "+enumClass.getSuperclass());//获取父类
        System.out.println("Methods: ");
        Set<String> methods=new TreeSet<String>();
        for(Method m:enumClass.getMethods()){//获取方法
            methods.add(m.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods=analyze(Explorer.class);
        System.out.println("--------------------");
        Set<String> enumMethods=analyze(Enum.class);
        System.out.println("EnumTest.Explorer.containsAll(Enum)"+exploreMethods.containsAll(enumMethods));
        exploreMethods.removeAll(enumMethods);
        System.out.println(exploreMethods);

    }
}

public class Reflection{
    public static void main(String[] args) {
        Explorer[] vals=Explorer.values();
        Enum e=Explorer.HERE;
        for (Enum en:e.getClass().getEnumConstants()){
            System.out.println(en);
        }
    }
}
