public class LearnArrays {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Access and print elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Modify an element in the array
        numbers[2] = 35;
        System.out.println("Modified third element: " + numbers[2]);

        // Print all elements using a loop
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Calculate and print the sum of all elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);

        // Find and print the maximum element in the array
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum element: " + max);

        // Find and print the minimum element in the array
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum element: " + min);

        // Print the length of the array
        System.out.println("Length of the array: " + numbers.length);

        // Demonstrate multi-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Elements of the 2D array (matrix):");

        // Print elements of the 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate and print the sum of all elements in the 2D array
        int matrixSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixSum += matrix[i][j];
            }
        }

        System.out.println("Sum of all elements in the 2D array: " + matrixSum);

//        int marks[][] = new int[4][3];
//        marks[0][0] = 12;
//        marks[0][1] = 15;
//        marks[0][2] = 17;
//
//        marks[1][0] = 20;
//        marks[1][1] = 22;
//        marks[1][2] = 25;
//
//        marks[2][0] = 30;
//        marks[2][1] = 32;
//        marks[2][2] = 35;
//
//        marks[3][0] = 40;
//        marks[3][1] = 42;
//        marks[3][2] = 45;
//
//        System.out.println("Marks of students:");
//        for(int i=0; i<marks.length; i++){
//            for(int j=0; j<marks[i].length; j++){
//                System.out.print(marks[i][j] + " ");
//            }
//            System.out.println();
//        }

        int marks[][] = {
            {12, 15, 17},
            {20, 22, 25},
            {30, 32, 35},
            {40, 42, 45}
        };
        System.out.println("Marks of students:");
        for(int i=0; i<marks.length; i++){
            for(int j=0; j<marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(marks[2][1]);

        // Length of 2D array
        System.out.println("Number of rows in marks array: " + marks.length);
        System.out.println("Number of columns in first row of marks array: " + marks[0].length);

        // Jagged array
        int jaggedArray[][] = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        System.out.println("Elements of the jagged array:");
        for(int i=0; i<jaggedArray.length; i++){
            for(int j=0; j<jaggedArray[i].length; j++){
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Length of jagged array
        System.out.println("Number of rows in jagged array: " + jaggedArray.length);
        System.out.println("Number of columns in first row of jagged array: " + jaggedArray[0].length);

        // Length of second row of jagged array
        System.out.println("Number of columns in second row of jagged array: " + jaggedArray[1].length);

        // Length of third row of jagged array
        System.out.println("Number of columns in third row of jagged array: " + jaggedArray[2].length);

        // Accessing an element in jagged array
        System.out.println("Element at jaggedArray[2][3]: " + jaggedArray[2][3]);

        // Sum of elements in jagged array
        int jaggedSum = 0;
        for(int i=0; i<jaggedArray.length; i++){
            for(int j=0; j<jaggedArray[i].length; j++){
                jaggedSum += jaggedArray[i][j];
            }
        }
        System.out.println("Sum of all elements in the jagged array: " + jaggedSum);

        // Average of elements in jagged array
        int jaggedCount = 0;
        for(int i=0; i<jaggedArray.length; i++){
            jaggedCount += jaggedArray[i].length;
        }
        double jaggedAverage = (double)jaggedSum / jaggedCount;
        System.out.println("Average of all elements in the jagged array: " + jaggedAverage);

        // End of main method v
    }
}
