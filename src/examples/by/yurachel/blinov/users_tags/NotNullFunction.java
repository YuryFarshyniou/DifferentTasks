package examples.by.yurachel.blinov.users_tags;

public class NotNullFunction {
    public static String notNull(Object ob) {
        String res = null;
        if (ob == null || ob.toString().isEmpty()) {
            res = "Attribute or PArametr is null or empty";
        } else {
            res = ob.toString();
        }
        return res;
    }
}
