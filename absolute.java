import java.util.Scanner;
import java.lang.Math;
public class absolute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int y=Math.abs(a);
        System.out.println("the absolute value is = "+y);
    }

}
