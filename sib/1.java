class A
{
static int i = 10;
static int j = test();

public static int test()
{
System.out.println("from test");
return 100;
}

public static void main(String gg[])
{
System.out.println("main "+i+" , "+j);
}

}