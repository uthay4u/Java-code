import java.lang.*;
import java.awt.*;
import java.applet.Applet;

public class ak_thread extends Thread implements Runnable
{
Thread t1;
public ak_thread()
{
t1=new Thread(this,"uthya thread");
t1.start();
}

public void run()
{
int i;
for( i=0;i<10;i++)
{
    try{
System.out.println("The Thread 2");
Thread.sleep(10000);
    }catch(InterruptedException e2){}
}
}
public static void main(String args[])
{
//t2=new ak_thread();
try{ 
Thread.sleep(5000);
}catch(InterruptedException e1){}
}
}

