import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {

        String str , reverse = "";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String/Number : ");
        str = s.nextLine();

        int length = str.length();

        for (int i = length -1; i >=0; i--)
        {

            reverse = reverse + str.charAt(i);
        }

       if (str.equals(reverse))
       {
           System.out.print("It's Palindrome  : " +str);
       }
       else
           System.out.print("It's not palindrome : " +str);
    }
}
