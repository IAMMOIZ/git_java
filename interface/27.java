interface abc
{
void test1();
}

interface bcd
{
void test2();
}

class cde
{
void test3()
{
System.out.println("test3()");
}
}

class A extends cde implements abc , bcd
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
obj.test3();
System.out.println("hellow world");
}
}