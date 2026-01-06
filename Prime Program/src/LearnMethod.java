public class LearnMethod {
    public static void main(String[] args) {
        System.out.println("Inside main method" + args.toString());
        greet();
    }

    static void greet() {
        System.out.println("Hello, welcome to LearnMethod class!");
    }

    // Static methods can be called without creating an instance of the class

    // Instance methods require an object of the class to be created before they can be called
    // For example:
    public void instanceGreet() {
        System.out.println("Hello from the instance method!");
    }

    // Method with parameters
    static int add(int a, int b) {
        return a + b;
    }
    // Method with return type
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method overloading
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Recursive method
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Variable-length arguments
    static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // Main method to demonstrate instance method call
    public static void demonstrateInstanceMethod() {
        LearnMethod lm = new LearnMethod();
        lm.instanceGreet();
    }

    // Entry point to demonstrate all methods
    public static void demonstrateAll() {
        greet();
        demonstrateInstanceMethod();
        System.out.println("Addition (2 args): " + add(5, 10));
        System.out.println("Addition (3 args): " + add(5, 10, 15));
        System.out.println("Multiplication: " + multiply(5, 10));
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Sum of variable args: " + sum(1, 2, 3, 4, 5));
    }

    // You can uncomment the following line to run all demonstrations
    // public static void main(String[] args) { demonstrateAll(); }

}
