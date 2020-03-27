import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        int t, x , y; // let x = 10; y= 5; t;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of X and Y :");

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before Swapping " +x +" " +y);
        t=x; x=y; y=t;
        
        System.out.println("After Swapping :"  +x +" " +y);
        System.out.println();
    }
}
