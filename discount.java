import java.util.Scanner;
public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the quantity");
        int quantity = sc.nextInt();
        int cost = sc.nextInt();
        double finalprice;
        int price = quantity * cost;
        if (price>1000)
        {
            finalprice = price * 0.1 ;
            System.out.println(price-finalprice);
        }
        else{
            System.out.println(price);
        }

    }
}
