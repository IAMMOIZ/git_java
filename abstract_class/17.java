abstract class abc
{
abc()
{
System.out.println("abc-const");
}
}
abstract class bcd extends abc
{
bcd()
{
System.out.println("bcd-const");
}
}

class A extends bcd
{
A()
{
System.out.println("A-const");
}
public static void main(String g[])
{
A obj = new A();
System.out.println("hello world");
}
}
//each constructo calls super class constructor 