import java.util.Scanner;
public class Natural_num {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter you number :");

        int n = s.nextInt();
        System.out.println("Your number is : ");

        for(int i = 1; i <= n; i ++ ){
            System.out.println(+i);
        }


    }

}
