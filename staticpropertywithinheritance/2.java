class ab
{
void test1()
{
System.out.println("ab-test1()");
}
}
class A extends ab
{
void test2()
{
System.out.println("A-test2()");
}
public static void main(String gg[])
{
A obj = new A();
obj.test1();
System.out.println("==========");
obj.test2();
}
}

//every member of super class inheriting to sub class