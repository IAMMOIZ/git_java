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
void test2()
{
System.out.println("def-test2");
}
}

class A
{
public static void main(String gg[])
{
bcd a1 = new bcd();
a1.test1();
System.out.println("-------------------");
a1.test2();
}
}
