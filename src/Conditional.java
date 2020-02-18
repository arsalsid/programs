import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        String str;
        int a = 8, b = 10;

        Scanner i = new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("Enter a Value:");
=======
        System.out.println("Enter a Value:" +" ");
>>>>>>> da0da7a8db2bc44d70dec5f05d95030bb6dc9748
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
