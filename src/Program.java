public class Program {
    public static void main(String[] args)
    {
        for (int i = 1; i < 3; i++)
        {
            System.out.println(i);
        }

        new Thread(()-> {
            for (int i = 4; i < 7; i++)
            {
                System.out.println(i);
            }
        }).start();
        System.out.println(5);
    }

}


