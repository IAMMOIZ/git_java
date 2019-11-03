class A
{
int i;
public static void main(String gg[])
{
A a1 = new A();
a1.i=10;
a1.i = 20;

final A a2 = new A();
a2.i = 10;
a2.i = 20;
a2 = new A();//error
}
}
//if we declared ref. variable as final then only we cannot assign any other object refrence to the variable but we can modify the object property
