import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

      //  int number = 10; //Primitive type contains value i.e. 10;

        int[] number = new int[5]; // This array refers list of values only i.e. called "Reference type"
        int[] numbers = {15,20,25,30,35};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        for (int i=0; i < numbers.length; i ++){
            System.out.println(numbers[i]);

        }

    }
}
