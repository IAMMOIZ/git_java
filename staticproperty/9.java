class ab
{
static int i = 10;
static
{
System.out.println("ab.sib");
}
static void test()
{
System.out.println("ab.test1");
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
System.out.println("-------------");
ab.i=20;
System.out.println("-------------");
ab.test();
System.out.println("-------------");
System.out.println(ab.i);
}
}