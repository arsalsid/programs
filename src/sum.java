public class sum {
    public static void main(String[] args) {
        int x = 559;
        int y = Math.round(x);              //Math.Round function//
        int z = x / y;
        float a = 4567.9874f;
        float b = -23456.345f;

        System.out.println("The Value is " +z);
        //  Float//
        System.out.println(Math.round(a));
        System.out.println(Math.round(b));

        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        
        System.out.println(Math.round(positiveInfinity));
        System.out.println(Math.round(negativeInfinity));

    }
}
