import SEE.Externals;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = s.nextInt();
        Externals[] students = new Externals[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Externals(); 
            System.out.println("\nEnter details for Student " + (i + 1));
            students[i].inputStudentDetails();  
            students[i].inputCIEmarks();        
            students[i].inputSEEmarks();        
            students[i].calculateFinalMarks();  
        }
        System.out.println("\nDisplaying final marks for all students:");
        for (int i = 0; i < n; i++) {
            students[i].displayFinalMarks();
        }
    }
}
