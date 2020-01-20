import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) {

     /*   int a = 2;  // Table of multiplication without input from user//


        for (int i = 1; i <= 10; i++) {
           System.out.printf("%d * %d = %d \n", a, i, a * i);
        } */

     
     // Multiplication Table by using input by user //

        Scanner s = new Scanner(System.in);
        System.out.println("Enter an Input:" +" ");
        int num = s.nextInt();

        for(int i = 1; i <=10; i++){
            System.out.println(num + "*" + i + "=" + (num * i));
        }
    }
}



