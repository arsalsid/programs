
public class sample {
    int a(){
        System.out.println("Method a return");

        return 10;
    }
}

    public static void main(String[] args) {
        sample s = new sample ();
        int x=s.a();
    }
}
