package homework.ex1;

public class Test {
    public static <T1 extends Number, T2 extends Number, T3 extends Number> T3 sum(T1 t1, T2 t2) {
        if (t1 instanceof Integer && t2 instanceof Integer) {
            int sum = t1.intValue() + t2.intValue();
            return (T3) Integer.valueOf(sum);
        }
        if (t1 instanceof Double && t2 instanceof Double) {
            double sum = t1.doubleValue() + t2.doubleValue();
            return (T3) Double.valueOf(sum);
        }

        if (t1 instanceof Integer && t2 instanceof Double) {
            double sum = t1.intValue() + t2.doubleValue();
            return (T3) Double.valueOf(sum);
        }

        if (t2 instanceof Integer && t1 instanceof Double) {
            double sum =t2.intValue() + t1.doubleValue();
            return (T3) Double.valueOf(sum);
        }

        return (T3) Integer.valueOf(0);
    }

    public static void main(String[] args) {

    }
}
