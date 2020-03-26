import java.lang.*;
import java.util.Scanner;

public class reve {
    public static void main(String[] args) {

        String str;
        int r;

      Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String : ");
        str = sc.nextLine();

        System.out.println("Enter your Variable : ");
        r = sc.nextInt();

        StringBuffer sbf = new StringBuffer(str);
        StringBuffer sbf2 = new StringBuffer(Integer.toString(r));

        System.out.println("String Buffer : " +sbf);
        System.out.println("Variable Buffer : " +sbf2);

        sbf.reverse();
        System.out.println("String after reverse : " +sbf);
        System.out.println("Variable after reverse : " +sbf2);
    }
}
