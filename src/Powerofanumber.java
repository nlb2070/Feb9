import java.util.Scanner;
public class Powerofanumber
{
    public static void main(String args[]){
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base number");
        a = s.nextInt();
        System.out.print("Enter the exponent");
        b = s.nextInt();
        double power = Math.pow(a,b);
        System.out.println(a+" to the power "+b+ " is " +power);
    }

}
