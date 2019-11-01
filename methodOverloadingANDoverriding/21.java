class A 
{
void test()
{
System.out.println("A-test()");
}
}
class R extends A
{
void test()
{
System.out.println("R-test(int)");
}

public static void main(String[] args) 
{
R r1 = new R();
r1.test();
}
}
 
 