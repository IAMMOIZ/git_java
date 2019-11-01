//default constructor
class D
{

//class non static property[object property]//every non static property of class called object property
int a;
long b;
short c;
byte d;
double e;
float f;
char g;
boolean h;
String i;



D()
{
System.out.println("constructor called-----");
}

public static void main(String gg[])
{
D c1 =new D();

//all object property default value when constructor is not initializing any value;

System.out.println("default value of int [without initialization ] : "+ c1.a);
System.out.println("default value of long [without initialization ] : "+ c1.b);
System.out.println("default value of short [without initialization ] : "+ c1.c);
System.out.println("default value of byte [without initialization ] : "+ c1.d);
System.out.println("default value of double [without initialization ] : "+ c1.e);
System.out.println("default value of float [without initialization ] : "+ c1.f);
System.out.println("default value of char [without initialization ] : "+ c1.g);
System.out.println("default value of boolean [without initialization ] : "+ c1.h);
System.out.println("default value of String  [without initialization ] : "+ c1.i);
}
}
//in constructor we can initialize non static member of the object
