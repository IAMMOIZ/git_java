class ab
{
static int i;
static void test1()
{
System.out.println("ab-test1()");
}
}
class A extends ab
{
static int j;
static void test2()
{
System.out.println("A-test2()");
}
public static void main(String gg[])
{
System.out.println(A.i);
System.out.println(A.i);
A.test1();
A.test2();
}
}
// all the static members of super class inherited to sub class