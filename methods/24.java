class A
{
public static void main(String gg[])
{
System.out.println("main begin");
test(10);
System.out.println("main end");
}

//test
public static void test(int i, int j)
{
System.out.println("from test : "+i+j);
}
}
//error: not suitable test method is available.
//required argument is one and available parameter is two