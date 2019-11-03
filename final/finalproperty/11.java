class A
{
public static void test(int x, final int y)
{
x=10;
y=20;
System.out.println("=============");
x=20;
y=30;

}

}
//if parameter is declared as final then we cannot modify it inside function