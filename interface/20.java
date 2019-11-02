interface abc
{
void test1();
void test2();
}

abstract class bcd implements abc
{
public void test1()
{
System.out.println("test1()");
}
//class bcd is declared abstract bcz it also containts test2() abstract method
}

class A extends bcd
{
public void test2()
{
System.out.println("test2()");
}

public static void main(String gg[])
{
A obj = new A();
obj.test1();
obj.test2();
System.out.println("hello world");
}
}

