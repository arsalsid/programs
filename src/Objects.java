class animal{

    String  Dog;
    int value = 9;

    void run()
    {
        System.out.println("Running");

          for (int i =0; i < 4; i ++)
          {
              System.out.println(" My " + Dog +   " is " + value +  "  years old. ");
          }

    }

    void name(String text)
    {
        System.out.println(text);
    }

    void work(int hours )
    {
       //System.out.println("I'm  Working " + hours + " hours a day");
        System.out.println("I'm  Working " + hours + " hours a week");
    }
}


public class Objects {
    public static void main(String[] args) {

        animal m = new animal();
        m.Dog = "Family Dog";
        m.value = 10;
       // m.run();
       // m.name("My Name's is Arsalan");
       // m.work(9);
        m.work( 45);

    }
}
