import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breath = sc.nextInt();
       
        if (length == breath){
            System.out.println("It is a square "+ "area is ");
        }
        else{
            System.out.println("it is not a square ");
        }
    }   
}
