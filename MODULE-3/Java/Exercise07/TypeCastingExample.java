
public class TypeCastingExample {

    public static void main(String[] args) {
        double originalDoubleValue1 = 45.78;
        int convertedIntValue1 = (int) originalDoubleValue1;
        System.out.println("Original Double Value : " + originalDoubleValue1);
        System.out.println("Converted Int Value   : " + convertedIntValue1);
        System.out.println(); 
        int originalIntegerValue1 = 100;
        double convertedDoubleValue1 = originalIntegerValue1;
        System.out.println("Original Integer Value: " + originalIntegerValue1);
        System.out.println("Converted Double Value: " + convertedDoubleValue1);
    }
}
