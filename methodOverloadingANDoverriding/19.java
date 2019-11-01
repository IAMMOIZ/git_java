//overriding with access specifier
class A
{
private void  test()
{
System.out.println("A-test default");
}
}

class B extends A
{

private void test()
{
System.out.println("private P-test()");
}
}

class P
{

public static void main(String gg[])
{
B b1 =new B();
b1.test();

}
}