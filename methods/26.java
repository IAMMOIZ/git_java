class A
{
public static void main(String gg[])
{
System.out.println("main begin");
test("abc",10);
System.out.println("main end");
}

//test
public static void test(int i,String j)
{
System.out.println("from test : "+i+j);
}
}