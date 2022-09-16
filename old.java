import java.util.Scanner;

public class old {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first age");
        int a = sc.nextInt();
        System.out.println("enter the second age");
        int b= sc.nextInt();
        System.out.println("enter the third age");
        int c = sc.nextInt();
        int oldest=0;
        int youngest =0;
        if (a>b && b>c || a>c && c>b ){
            oldest = a;
            if (b>c){
                youngest = c;
            }
            else{
                youngest = b;
            }
            
        }
        if (b>a && a>c || b>c && c>a ){
            oldest = b;
            if (a>c){
                youngest = c;
            }
            else{
                youngest = a;
            }
        }
            
        if (c>a && a>b || c>b && b>a){
                oldest = c;
            if (a>b){
               youngest = b;
            }
            else{
                 youngest = a;
            }
        }     

        System.out.println("the youngest is "+youngest);
        System.out.println("the oldest is "+oldest);
    }
}
