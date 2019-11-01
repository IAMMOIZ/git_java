abstract class abc
{
abstract void test1();
void test2()
{
System.out.println("abc-test1");
}
}

class def extends abc
{
void test1()
{
System.out.println("def-test1");
}
}

class A
{
public static void main(String gg[])
{
abc obj1 = null;
def obj2 = new def();
obj2.test1();
obj2.test2();
System.out.println("hello world");
}
}