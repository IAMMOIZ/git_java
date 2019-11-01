class abc
{
static void test()//static method
{
System.out.println("abc-test");
}
}
class A
{
public static void main(String gg[])
{
abc obj = null;
abc.test();//calling a static method throgh its className
System.out.println("hellow world");
}
}
//we can call static method throgh its classname