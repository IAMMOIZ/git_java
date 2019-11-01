abstract class abc
{
abstract void test1();
abstract void test2();
}

class bcd extends abc
{
void test1()
{
System.out.println("def-test1");
}
}

class A
{
public static void main(String gg[])
{
System.out.println("hello world");
}
}

//test2 method should also be defined inside class def which is extending class abc