//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class boxing2 {
    public static void main(String[] args) {
        // Boxing: Converting primitive to wrapper class object
        Integer boxedInt=Integer.valueOf(100);
        Double boxedDouble=Double.valueOf(25.5);
        Character boxedChar = Character.valueOf('A');
        Boolean boxedBoolean = Boolean.valueOf(true);
        Float boxedFloat = Float.valueOf(30.5f);

        // Unboxing: Converting wrapper object to primitive
        int unboxedInt= boxedInt.intValue();
        double unboxedDouble= boxedDouble.doubleValue();
        char unboxedChar = boxedChar.charValue();
        boolean unboxedBoolean = boxedBoolean.booleanValue();
        float unboxedFloat = boxedFloat.floatValue();

        // Display results
        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);

        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Unboxed Double: " + unboxedDouble);

        System.out.println("Boxed Character: " + boxedChar);
        System.out.println("Unboxed Character: " + unboxedChar);

        System.out.println("Boxed Boolean: " + boxedBoolean);
        System.out.println("Unboxed Boolean: " + unboxedBoolean);

        System.out.println("Boxed Float: " + boxedFloat);
        System.out.println("Unboxed Float: " + unboxedFloat);
    }
}