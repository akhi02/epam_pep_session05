package pep_task5.pep_task5;

public class App extends Thread
{
    public void run()
    {
        creategui a=new creategui();
        a.createguifunction();
    }
    public static void main(String args[])
    {
        App t1=new App();
        t1.start();
    }
}