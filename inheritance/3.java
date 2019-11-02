class A
{

static int i;
static void test1()
{
System.out.println("A-test");
}

class B extends A
{
static  int j;
static void test2()
{
System.out.println("test2");
}
}

public static void main(String gg[])
{
System.out.println("hello world");
}
}

//inside innerclasses we cannot define a static member it will cause of error