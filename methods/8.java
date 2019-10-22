//use of return keyword
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
test();
System.out.println("main end");
}
public static void test()
{
System.out.println("test");
return; //we are not returning anything so returntype of test is void .
}
}