
public class sample {
    int a(){
        System.out.println("m1 method");

        return 10;
    }
    float f(){
        System.out.println("float method");

        return 20.5f;
    }

    public static void main(String[] args) {
        sample s = new sample ();
        int x=s.a();
        System.out.println("Return value of a()= " +x);

        float y=s.f();
        System.out.println("Return value of b()= " +y);
    }
}

