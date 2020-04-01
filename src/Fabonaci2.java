import java.util.Scanner;
public class Fabonaci2 {
//    public static void main(String[] args) {
//        int maxnumber = 0;
//        int previousnumber = 0;
//        int nextnumber = 1;
//
//        System.out.println("Enter a fabonacci number : ");
//        Scanner sc = new Scanner(System.in);
//        maxnumber = sc.nextInt();
//
//        for (int i = 1; i < maxnumber ; i++)
//        {
//            System.out.println(previousnumber +"");
//
//            int sum = previousnumber + nextnumber;
//            previousnumber = nextnumber;
//            nextnumber = sum;
//        }
//    }


    ///Recursion/////
public static int fibonacciRecursion(int n){
    if(n == 0){
        return 0;
    }
    if(n == 1 || n == 2){
        return 1;
    }
    return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
}
    public static void main(String args[]) {
        int maxNumber = 10;
        System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
        for(int i = 0; i < maxNumber; i++){
            System.out.print(fibonacciRecursion(i) +" ");
        }
    }
}

