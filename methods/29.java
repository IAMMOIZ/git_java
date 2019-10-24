class A
{
public static void main(String gg[])
{
System.out.println("main begin");
int i=10;
test(i);
System.out.println("main end "+i);
}

//test
public static void test(int i)
{
System.out.println("from test "+i);
i = 20;//only i which scope is inside test will be changed . i of main will not be effected
}
}