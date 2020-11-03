package demo;

/**
 * -XX:PermSize=6M -XX:MaxPermSize=6M
 * -Xmx6m -XX:PermSize=6M -XX:MaxPermSize=6M
 * @program: Jvm
 * @author: ouguoxin
 * @create: 2020-11-03 14:37
 **/

public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
       /* Set<String> set = new HashSet<String>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }*/
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }


}

