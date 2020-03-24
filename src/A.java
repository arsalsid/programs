
public class A {

    private void print()
    {
        System.out.println("A");
    }
    private void print(String str)
    {
        System.out.println("b");
    }
    private void print (int x)
    {
        System.out.println("c");
    }
//    public void printd()
//    {
//        this.print();
//    }

    public static void main(String[] args) {
        A obj = new A ();
        obj.print("arsalan");


    }
}
