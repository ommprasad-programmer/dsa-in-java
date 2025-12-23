public class apseries {
    public static void main(String[] args) {
        int firstTerm = 2;       // The starting number (a)
        int commonDifference = 3;  // The common difference (d)
        int numberOfTerms = 5;   // The number of terms to print (n)

        System.out.print("Arithmetic Progression: ");

        for (int i = 0; i < numberOfTerms; i++) {
            // Calculate the current term using the formula: a + i * d
            int currentTerm = firstTerm + i * commonDifference;
            System.out.print(currentTerm + " ");
        }

        System.out.println(); // Prints a newline character at the end
    }
}
