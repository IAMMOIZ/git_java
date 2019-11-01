abstract class abc
{
void test()
{
System.out.println("abc-test");
}
}
class A
{
public static void main(String gg[])
{
abc obj = new abc();//error
obj.test();
System.out.println("hello world");
}
}
//we cannot create object of abstract class