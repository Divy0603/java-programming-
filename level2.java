import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter your sex");
        String sex = sc.next();
        System.out.println("enter your marital status");
        String marital = sc.next();
        if(sex.equals("female")){
            System.out.println("you will work in urban area");

        }
        else if(sex.equals("male") && (age>20 && age<40)){
            System.out.println("you will work in anywhere");
        }
        else if(sex.equals("male") && (age>40 && age<60)){
            System.out.println("you will work in urban area");
        }
        else if( age >60 || age<20){
            System.out.println("ERROR");
        }
    }
}
