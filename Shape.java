import java.io.*;
import java.util.*;
abstract class Shape
{
public int x,y;
public abstract void printArea();
}

class Rectangle1 extends Shape
{
public void printArea()
{
float area;
area=x*y;
System.out.println("Area of Rectangle is"+area);
}
}

class Triangle extends Shape
{
public void printArea()
{
float area;
area=(x*y)/2.0f;
System.out.println("Area of Triangle is"+area);
}
}

class Circle extends Shape
{
public void printArea()
{
float area;
area=(22*x*x)/7.0f;
System.out.println("Area of Circle is"+area);
}
}

class AreaOfShapes
{
public static void main(String args[])
{
int choice=0;
while(choice<4)
{
Scanner sc=new Scanner(System.in);
System.out.println("Menu \n 1.Area of Rectangle \n 2.Area of Triangle \n 3.Area of Circle");
System.out.println("Enter your choice :");
choice=sc.nextInt();
switch(choice)
{
   case 1:System.out.println("Enter length and breadth for area of rectangle:");
          Rectangle1 r=new Rectangle1();
          r.x=sc.nextInt();
          r.y=sc.nextInt();
          r.printArea();
          break;
   case 2:System.out.println("Enter breadth and height for area of triangle:");
          Triangle t=new Triangle();
          t.x=sc.nextInt();
          t.y=sc.nextInt();
          t.printArea();
          break;
   case 3:System.out.println("Enter radius for area of circle:");
          Circle c=new Circle();
          c.x=sc.nextInt();
          c.printArea();
          break;
  default:System.out.println("Enter correct choice");
}
}
}
}