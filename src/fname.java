import java.util.Scanner;
public class fname {
    public static void main(String[] args) {
        String f_name;
        String family_name;
        String full_name;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your First Name : ");
        f_name = s.next();

        System.out.print("Enter your family Name : ");
        family_name = s.next();

        full_name = f_name+ " " +family_name;
        System.out.println("You're " +full_name);
    }
}
