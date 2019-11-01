class A 
{
void test()
{
System.out.println("A-test()");
}
}
class S extends A
{
void test()
{
System.out.println("S-test(int) begin");
super.test();
System.out.println("S-test(int) end");
}

public static void main(String[] args) 
{
S s1 = new S();
s1.test();
}
}
 
 