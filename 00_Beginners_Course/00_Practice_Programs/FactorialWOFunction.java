public class FactorialWOFunction {
    public static void main(String[] args) {
        int num = 1, fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        System.out.println("Factorial of " + num + " = " + fact);

        num = 2; fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        System.out.println("Factorial of " + num + " = " + fact);

        num = 3; fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        System.out.println("Factorial of " + num + " = " + fact);
    }
}
