package demo;

/**
 * -Xss128k
 * @program: Jvm
 * @author: ouguoxin
 * @create: 2020-11-03 11:30
 **/

public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:"+oom.stackLength);
            throw e;
        }

    }

}

