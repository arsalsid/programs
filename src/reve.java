import java.lang.*;
import java.util.Scanner;
public class reve {
    public static void main(String[] args) {

        String str;
        int rev;

      Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String : ");
        str = sc.nextLine();

        System.out.println("Enter your Variable : ");
        rev = sc.nextInt();

        StringBuffer sbf = new StringBuffer(Integer.toString(rev));
        StringBuffer sbf2 = new StringBuffer(str);

        System.out.println("Variable Buffer " +sbf);
        System.out.println("String Buffer" +sbf2);


        sbf.reverse();
        System.out.println("Variable after reverse : " +sbf);
        System.out.println("String after reverse : " +sbf2);
    }
}
