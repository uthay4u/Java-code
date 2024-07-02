import java.io.*;
interface Drawable
{
void draw();
}
class circle implements Drawable
{
public void draw()
{
System.out.println("Drawing circle");
}
}
class rectangle implements Drawable
{
public void draw()
{
System.out.println("Drawing Rectangle");
}
}
class ak_main
{
public static void main(String args[])throws IOException
{
Drawable d1=new circle();
d1.draw();
}
}