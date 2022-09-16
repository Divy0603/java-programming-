import java.util.Scanner;
import java.lang.String;
public class medical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of classes held");
        float held = sc.nextInt();
        System.out.println("enter the number of classes attended");
        float attended = sc.nextInt();
        System.out.println("do you have a medical cause");
        String med = sc.next();
        float percentage =  (attended/held) * 100;
        
        System.out.println(percentage);
        if (med .equals("yes")){
            System.out.println("you are allowed");

        }
        else if(med.equals("no")){
            if (percentage > 75){
                System.out.println("you arre allowed to sit in the exam");
    
            }
            else{
                System.out.println("you are not allowed to enter the exam");
    
            }
        }
         
    }
}

