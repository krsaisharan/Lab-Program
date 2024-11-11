package CIE;
import java.util.Scanner;
public class internals extends Student {
    protected int marks[] = new int[5]; 
    public void inputCIEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = s.nextInt();
        }
    }
}
