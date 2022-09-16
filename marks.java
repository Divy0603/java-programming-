import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your marks");
        int marks = sc.nextInt();
        if (marks <25){
            System.out.println("your grade is F");
        }
        if (marks> 25 && marks <45){
            System.out.println("your grade is E");
        }
        if (marks> 45 && marks < 50){
            System.out.println("your grade is D");
        }
        if (marks> 50 && marks <60){
            System.out.println("your grade is C");
        }
        if (marks> 60  && marks <80){
            System.out.println("your grade is B");
        }
        if (marks> 80){
            System.out.println("your grade is A");
        }
    }
}
