public class B_conditionals {
    public static void main(String[] args) {
        // Conditional statements in Java(if else statements)
        int num = 10;

        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // Ternary operator in Java
        int max = (num > 0)? num : 0;
        System.out.println("Maximum value: " + max);
    }
}
