import java.util.Scanner;

public class chartostring {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char M = s.next().charAt(0);
        String T = Character.toString(M);
        System.out.print("String is: " + T);
    }

}
