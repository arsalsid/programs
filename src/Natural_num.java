import java.util.Scanner;
public class Natural_num {
    public static void main(String[] args) {

        int n;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter you number :");
        n = s.nextInt();

        System.out.println("Your number is Natural number");

        for(int i = 1; i <= n; i ++ ){
            System.out.println(+i);
        }
    }

}
