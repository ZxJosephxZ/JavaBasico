package Thread;

public class Thread {
    public static void main(String[] args) {
    Hilo1 hilo1 = new Hilo1();
    hilo1.start();
    java.lang.Thread hilo2 = new java.lang.Thread(new Hilo2());
    hilo2.start();
    }
}

class Hilo1 extends java.lang.Thread
{
    public void run()
    {
        for (int i = 0;i<10;i++)
        {
            System.out.println("soy el hilo1");
        }
    }
}

class Hilo2 implements Runnable
{
    @Override
    public void run() {
        for (int i = 0;i<10;i++)
        {
            System.out.println("soy el hilo2");
        }
    }
}
