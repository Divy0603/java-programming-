import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int x=sc.nextInt();
        if ((x % 4==0 || x % 400==0) && x!=100){
            System.out.println("leap year");

        }
        else{
            System.out.println("not a leap year");
        }
    }
}
