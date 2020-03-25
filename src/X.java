public class X {

    static int x= 5;

    public static void main(String[] args) {
        int x;

        x = X.x = x = X.x;
        System.out.println(x++);
    }
}
