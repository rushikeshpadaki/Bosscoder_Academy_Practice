public class FactorialWithFunction {
    static int calculateFactorial (int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++)
            fact *= i;

        return fact;
    }

    public static void main(String[] args) {
        int num = 1;
        System.out.println("Factorial of " + num + " = " + calculateFactorial(num));

        num = 2;
        System.out.println("Factorial of " + num + " = " + calculateFactorial(num));

        num = 3;
        System.out.println("Factorial of " + num + " = " + calculateFactorial(num));
    }
}
