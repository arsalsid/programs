import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {

        int number = 0;

        Scanner value = new Scanner(System.in);

        do {
            System.out.println("Enter a number :");
            number = value.nextInt();
        }
        while (number != 9);
        System.out.println("You got 9!");
    }
}
