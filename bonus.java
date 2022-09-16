import java.util.Scanner;
public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your salary");

        int salary = sc.nextInt();
        System.out.println("enter your years of working");
        int years = sc.nextInt();
        double bonus = salary * 0.05;
        if (years>5){
            System.out.println("your salary is "+(salary+bonus));

        }
        else{
            System.out.println("your salary is " +salary);
        }

    }
}
