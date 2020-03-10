import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {

        Scanner val = new Scanner(System.in);
        //Variable switch supported by char, short, byte, int and String

        System.out.println("Enter your instruction");
        String text = val.nextLine();

        switch (text){
            case "run":
                System.out.println("Your program is running");
                break;

            case  "stop":
                System.out.println("Your program is stopped");
                break;

                default:
                    System.out.println("Your instruction is un-recognized");
        }
    }
}
