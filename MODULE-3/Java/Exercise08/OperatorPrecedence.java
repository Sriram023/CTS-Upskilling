public class OperatorPrecedence {
    public static void main(String[] args) {
        int res1 = 10 + 5 * 2;
        System.out.println("Expression 1: 10 + 5 * 2");
        System.out.println("Result: " + res1);
        System.out.println();
        int res2 = (10 + 5) * 2;
        System.out.println("Expression 2: (10 + 5) * 2");
        System.out.println("Result: " + res2);
        System.out.println();
        int res3 = 20 / 2 + 3;
        System.out.println("Expression 3: 20 / 2 + 3");
        System.out.println("Result: " + res3);
        System.out.println();
        int res4 = 15 - 10 % 3;
        System.out.println("Explanation:");
        System.out.println("Multiplication and division are performed before addition unless parentheses are used.");
    }
}
