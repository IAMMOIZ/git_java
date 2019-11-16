class A
{
static void test(int ... args)
{
System.out.println("var args");
}

public static void main(String gg[])
{
test();
test(1);
test(1,2);
test(1,2,3);
test(2,5);
System.out.println("hello world");
}
}