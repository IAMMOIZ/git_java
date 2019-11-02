class ab
{
static int i = 10;
}

class abc
{
static int i = 20;
}

class abcd
{
static void test()
{
System.out.println("from test");
}
}

class A
{
public static void main(String gg[])
{
System.out.println(ab.i);
System.out.println(abc.i);
abcd.test();
}
}