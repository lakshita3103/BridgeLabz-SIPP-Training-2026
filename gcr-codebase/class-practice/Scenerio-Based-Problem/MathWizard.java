class MathWizard {

    public static void main(String[] args) {

        MathWizard obj = new MathWizard();

        System.out.println("Is 17 Prime? " + obj.isPrime(17));

        System.out.println("Factorial of 5 = " + obj.factorial(5));

        System.out.println("Factorial of 6.0 = " + obj.factorial(6.0));

        obj.fibonacci(8);

        System.out.println("GCD of 24 and 36 = " + obj.gcd(24, 36));

        System.out.println("LCM of 24 and 36 = " + obj.lcm(24, 36));

        System.out.println("2^5 = " + obj.power(2, 5));

        obj.showScope();
    }
    // Instance variable
    int number = 100;

    // Prime Check
    boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Factorial using iteration (int version)
    long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Overloaded factorial (double version)
    double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int)n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Fibonacci series up to n terms
    void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    // GCD using Euclidean algorithm
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM
    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Power function
    long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    // Demonstrating local and instance variables
    void showScope() {

        // Local variable
        int number = 50;

        System.out.println("Local Variable = " + number);
        System.out.println("Instance Variable = " + this.number);
    }
}

