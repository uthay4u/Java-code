import java.lang.*;
public class ak_thread extends Thread implements Runnable
{
TextField t1,t2;
public void ak_thread()
{
t1=new ak_thread();
}
public void run()
{
int i;
for( i=0;i<10;i++)
{
System.out.println("The Thread 2");
Thread.sleep(10000);
}
}
public static void main(String args[])
{
t2=new ak_thread();
Thread.sleep(5000);
}
}

