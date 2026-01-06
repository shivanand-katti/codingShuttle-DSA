public class LearnLoops {
    public static void main(String[] args) {
        // for loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // while loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        // do-while loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k <= 5);

        // nested loops
        System.out.println("\nNested Loops:");
        for (int m = 1; m <= 3; m++) {
            for (int n = 1; n <= 2; n++) {
                System.out.println("Outer loop iteration " + m + ", Inner loop iteration " + n);
            }
        }

        // loop with break and continue
        System.out.println("\nLoop with Break and Continue:");
        for (int p = 1; p <= 10; p++) {
            if (p == 6) {
                System.out.println("Breaking the loop at iteration " + p);
                break;
            }
            if (p % 2 == 0) {
                System.out.println("Skipping even iteration " + p);
                continue;
            }
            System.out.println("Iteration " + p);
        }

        // infinite loop (commented out to prevent execution issues)

        System.out.println("\nInfinite Loop:");
        int q = 1;
        while (true) {
            System.out.println("Iteration " + q);
            q++;
            if (q > 5) { // Just to prevent actual infinite loop during execution
                break;
            }
        }

        // enhanced for loop
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // loop with labels
        System.out.println("\nLoop with Labels:");
        outerLoop:
        for (int r = 1; r <= 3; r++) {
            for (int s = 1; s <= 3; s++) {
                if (r == 2 && s == 2) {
                    System.out.println("Breaking out of outer loop at r=" + r + ", s=" + s);
                    break outerLoop;
                }
                System.out.println("r=" + r + ", s=" + s);
            }
        }

        // loop to print a pattern
        System.out.println("\nPattern Printing:");
        int rows = 5;
        for (int t = 1; t <= rows; t++) {
            for (int u = 1; u <= t; u++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // loop to calculate factorial
        System.out.println("\nFactorial Calculation:");
        int number = 5;
        int factorial = 1;
        for (int v = 1; v <= number; v++) {
            factorial *= v;
        }
        System.out.println("Factorial of " + number + " is " + factorial);

        // loop to find prime numbers
        System.out.println("\nPrime Numbers up to 20:");
        for (int w = 2; w <= 20; w++) {
            boolean isPrime = true;
            for (int x = 2; x <= Math.sqrt(w); x++) {
                if (w % x == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(w + " ");
            }
        }

        // End of the program

    }
}
