import java.util.Scanner;

public class StudentPerformanceTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks of students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        int max = marks[0];
        int min = marks[0];

        for (int i = 0; i < n; i++) {
            sum += marks[i];

            if (marks[i] > max) {
                max = marks[i];
            }

            if (marks[i] < min) {
                min = marks[i];
            }
        }

        double average = (double) sum / n;

        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Total Marks: " + sum);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);

        sc.close();
    }
}
