import java.util.Scanner;
public class stringtochar {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String M = s.nextLine();
        for (int i = 0; i < M.length(); i++) {
            char T = M.charAt(i);
            System.out.println("Character at " + i + " Position: " + T);
        }
        }
    }