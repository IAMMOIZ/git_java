class ab
{
static int i = 10;
static
{
System.out.println("ab.sib");
}
static void test1()
{
System.out.println("ab.test1");
}
static void test2()
{
System.out.println("ab.test2");
}
}

class abc
{
static
{
System.out.println("abc.sib");
//return 100;//return stmt is not allowed inside sib
}

static void test3()
{
System.out.println("abc.test3");
}
}
class A
{
static
{
System.out.println("A-sib");
}
public static void main(String gg[])
{
System.out.println(ab.i);
System.out.println("======");
ab.i = 20;
System.out.println("======");
ab.test1();
System.out.println("======");
System.out.println(ab.i);
System.out.println("======");
abc.test3();
System.out.println("======");
abc.test3();
System.out.println("======");
}
}