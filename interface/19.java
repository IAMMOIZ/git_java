interface abc
{
void test1();
void test2();
}

class A implements abc
{

public void test1()
{
System.out.println("test1()");
}

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