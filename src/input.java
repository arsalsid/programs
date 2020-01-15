import java.util.Scanner;

public class input {

    public static void main(String[] args) {

        String str;
        String blank = " ";

        Scanner s = new Scanner (System.in);
        System.out.println("Your First Name : " );
        str = s.nextLine();
        System.out.println("Hello" +blank +str);

    }
}
