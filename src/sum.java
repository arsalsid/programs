public class sum {
    public static void main(String[] args) {
        int x = 559;
        int y = Math.round(x);              //Math.Round function//
        int z = x / y;
        float a = 4567.9874f;
        float b = -23456.345f;
        float d = 7689.1f;
        float g = -794.99f;
        System.out.println("The Value is " +z);
        //  Float//
        System.out.println(Math.round(a));
        System.out.println(Math.round(b));

        // Exponent Values
        System.out.println(Math.getExponent(d));
        System.out.println(Math.getExponent(g));
        System.out.println(Math.getExponent(0));

        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;

        System.out.println(Math.round(positiveInfinity));
        System.out.println(Math.round(negativeInfinity));

    }
}
