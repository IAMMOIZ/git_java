//default constructor
class E
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



E()
{
System.out.println("constructor called-----");
a=10;
b=20;
c=30;
d=40;
e=55.66;
f=3.5f;
g='a';
h=true;
i="hellow";
}

public static void main(String gg[])
{
E e1 =new E();

//all object property default value when constructor is not initializing any value;

System.out.println("default value of int [initialized in constructor] : "+ e1.a);
System.out.println("default value of long [initialized in constructor] : "+ e1.b);
System.out.println("default value of short [initialized in constructor] : "+ e1.c);
System.out.println("default value of byte [initialized in constructor] : "+ e1.d);
System.out.println("default value of double [initialized in constructor] : "+ e1.e);
System.out.println("default value of float [initialized in constructor] : "+ e1.f);
System.out.println("default value of char [initialized in constructor] : "+ e1.g);
System.out.println("default value of boolean [initialized in constructor] : "+ e1.h);
System.out.println("default value of String  [initialized in constructor] : "+ e1.i);
}
}
//in constructor we can initialize non static member of the object
