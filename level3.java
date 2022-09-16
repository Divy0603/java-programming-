import java.util.Scanner;

public class level3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of digits");
        int p=sc.nextInt();
        int a = sc.nextInt();
        int sum=0;
        int n;
        for (int i = 0; i<p;i++){
            n = a%10;
            sum=(sum*10)+n;
            a=a/10;
            
        }
        System.out.println(sum);
    }
}
