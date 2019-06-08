import java.lang.reflect.Method;

public class NestedMain {

    public static void main(String[] args) throws Exception{
        NestedAccess nestedAccess = new NestedAccess();
        nestedAccess.getInner().innerPublic();
        innerPublicReflection(nestedAccess);
    }

    public static void innerPublicReflection(NestedAccess nestedAccess) throws Exception {
        Method method = nestedAccess.getClass().getDeclaredMethod("outerPrivate");
        method.invoke(nestedAccess);
    }
}
