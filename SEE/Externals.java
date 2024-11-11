package SEE;
import CIE.internals;
import java.util.Scanner;
public class Externals extends internals {
    protected int ext_marks[] = new int[5]; 
    protected int fin_marks[] = new int[5];   
    public Externals() {
        ext_marks = new int[5];
        fin_marks = new int[5];
    }
    public void inputSEEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter external marks for 5 subjects: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter external marks for subject " + (i + 1) + ": ");
            ext_marks[i] = s.nextInt();
        }
    }
    public void calculateFinalMarks() {
        for (int i = 0; i < 5; i++) {
            fin_marks[i] = marks[i] + ext_marks[i];  
        }
    }
    public void displayFinalMarks() {
        displayStudentDetails(); 
        System.out.println("Final Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + fin_marks[i]);
        }
    }
}
