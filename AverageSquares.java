import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {
                // Declare Scanner object
        Scanner in = new Scanner(System.in);
        double sum = 0.0;
        double i;

        // Prompt for input
        System.out.print("Enter your name: ");

        // Read in line from standard input
        String name = in.nextLine();

        System.out.println("Hi " + name + "!");

        in.nextLine();

        System.out.print("Please enter the start value: ");
        double startNum = in.nextInt(); // Reads in an int from standard input

        in.nextLine(); // clear any additonal text that remains uncollected 
        
        System.out.print("Please enter the end value: ");
        double endNum = in.nextInt();
        
        i = startNum;
        do {
            sum += i * i;
            i++;
        }
        while (i <= endNum);

        double average = sum / ((endNum - startNum)/2 + startNum);

        System.out.println("Average of squares from " + startNum + " to " + endNum + ":");
        System.out.println(average);
    }
}