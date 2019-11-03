class ab
{
int i;
static int j;
public void test1()
{
System.out.println("ab-test1");
}
public static void test2()
{
System.out.println("ab-test2");
}
}

class A extends ab
{
int a;
static int b;
public void test3()
{
System.out.println("A-test3");
}
public static void test4()
{
System.out.println("A-test4");
}

public static void main(String gg[])
{
A a1 = new A();
System.out.println(a1.i);
System.out.println(A.j);
System.out.println(a1.a);
System.out.println(A.b);
a1.test1();
a1.test3();
A.test2();
A.test4();
}
}