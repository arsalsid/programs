import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        int num1 = 20;
        boolean num2= true;
        String num3 = "Arsalan";
        String str;
        String blank = " ";

        Scanner s = new Scanner(System.in);


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println("Your First Name : ");
        str = s.nextLine();
        System.out.println("Hello" +blank +str);





    }
}
