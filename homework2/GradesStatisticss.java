import java.util.Scanner;

public class GradesStatisticss {
    static int[] grades;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of student: ");
        int numStudents = sc.nextInt();
        GradesStatistics gradesStatis = new GradesStatistics();
        grades = readGrades(numStudents);
        System.out.println("The average is " + calAverage(grades));
        System.out.println("The minium is " + findMin(numStudents,grades));
        System.out.println("The maxium is " + findMax(numStudents,grades));
    }
    public static int[] readGrades(int numStudents){
        grades = new int[numStudents];
        double sum = 0;
        for (int idx = 0; idx < numStudents; idx++) {
            System.out.print("Enter the grade for student " + (idx + 1) + ": ");
            int grade = sc.nextInt();
            if (grade >= 0 && grade <= 100) {
                grades[idx] = grade;

            }
            System.out.println();

        }
        return grades;
    }
    public static double calAverage(int[] grades){
        double sum = 0;
        for (int idx = 0; idx < grades.length; idx++){
            sum += grades[idx];
        }
        return sum / grades.length;
    }
    public static int findMax(int numStudents, int[] grades) {
        int max = grades[0];
        for (int idx = 0; idx < numStudents; idx++) {
            if (grades[idx] >= max) {
                max = grades[idx];
            }
        }
        return max;
    }
    public static int findMin(int numStudents, int[] grades) {
        int min = grades[0];
        for (int idx = 0; idx < numStudents; idx++) {
            if (grades[idx] <= min) {
                min = grades[idx];
            }
        }
        return min;
    }
}
