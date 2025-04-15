package comm.man.easy;

public class StepsToZero {
    public static void main(String[] args) {
        // Create an instance of the class to call the non-static method
        StepsToZero obj = new StepsToZero();
        int result = obj.numberOfSteps(14);
        System.out.println(result); // Outputs the number of steps to reduce 14 to zero
    }

    // Method to calculate the number of steps
    public int numberOfSteps(int num) {
        return helper(num, 0); // Invoke the static helper method
    }

    // Helper method to recursively compute the steps
    static int helper(int n, int steps) {
        if (n == 0) {
            return steps; // Base case: Return the total steps
        }
        if (n % 2 == 0) {
            return helper(n / 2, steps + 1); // If n is even, divide by 2
        }
        return helper(n - 1, steps + 1); // If n is odd, subtract 1
    }
}