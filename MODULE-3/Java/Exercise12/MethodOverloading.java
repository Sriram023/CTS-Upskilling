public class MethodOverloading {
    public static int add(int s, int r) {
        return s + r;
    }
    public static double add(double s, double r) {
        return s + r;
    }
    public static int add(int s, int r, int i) {
        return s + r + i;
    }
    public static void main(String[] args) {
        System.out.println("Sum of Two Integers      : " + add(10, 20));
        System.out.println("Sum of Two Doubles       : " + add(12.3, 13.2));
        System.out.println("Sum of Three Integers    : " + add(10, 20, 30));
    }
}
