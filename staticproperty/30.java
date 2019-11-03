class A
{
static int i;

static void test()
{
System.out.println("test "+i);
i = 20;
}

public static void main(String gg[])
{
System.out.println("main begin "+i);
System.out.println("main end "+i);
}
}
//static attributes can be used by all the members of same class