class A
{
final int i;
A()
{
i = 10;
}

A(int i)
{
this();
}
public static void main(String gg[])
{
A a1 = new A(5);
System.out.println(a1.i);
}
}

