import java.util.Scanner;
public class Pattern {
    public static void main pyramid ( int n) {

        for ( int i =0; i < 5; i++)
        {
            System.out.println(" ");
        }
        for (int j = 0; j <=i; j++)
        {
            System.out.println(" * ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        pyramid(n);
    }
}
