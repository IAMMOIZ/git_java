class A
{
static int i;

public static void test()
{
System.out.println("test "+i);
i+=20;
}

public static void main(String gg[])
{
System.out.println("main begin "+i);
i+=10;
A.test();
System.out.println("=======");
i+=20;
System.out.println("main end "+i);
}
}