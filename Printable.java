import java.io.*;
interface Printable
{
void print();
}
interface Showable
{
void show();
}
class ak_Interface implements Printable,Showable
{
public void print()
{
System.out.println("Hello");
}
public void show()
{
System.out.println("Welcome");
}
public static void main(String args[])
{
ak_Interface ak=new ak_Interface();
ak.print();
ak.show();
}
}