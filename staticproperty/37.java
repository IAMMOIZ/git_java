class A
{

static int i = test1();
static int j = test2();

public static int test1()
{
System.out.println("from test1");
return 100;
}

public static int test2()
{
System.out.println("from test2");
return 200;
}

public static void main(String gg[])
{
System.out.println("main : "+i+" , "+j);
}
}