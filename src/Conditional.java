import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        String str;
        int a = 8, b = 10;

        Scanner i = new Scanner(System.in);

        System.out.println("Enter a Value:");

        System.out.println("Enter a Value:" +" ");

        str = i.nextLine();

        if(a > b){
            System.out.println("Verified");
        }
        else {
            System.out.println("Unverified");
        }
        if (a==b){
            System.out.println("Matched");
        }
        else{
            System.out.println("Unmatched");
        }
    }
}
