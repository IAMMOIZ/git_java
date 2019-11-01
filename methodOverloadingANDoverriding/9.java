class A
{
void test()
{
System.out.println("A-test");
}
}


class I extends A
{

public static void main(String gg[])
{
I obj = new I();
obj.test();
System.out.println("hello world");
}
}
