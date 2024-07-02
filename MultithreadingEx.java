class MultithreadingEx extends Thread
{
public void run()
{
try
{
System.out.println("Thread"+Thread.currentThread().getId()+"is running");
}
catch(Exception e)
{
System.out.println("Exception is caught");
}
}
}
class threadMain
{
public static void main(String args[])
{
int n=8;
for(int i=0;i<n;i++)
{
MultithreadingEx t1=new MultithreadingEx();
t1.start();
}
}
}