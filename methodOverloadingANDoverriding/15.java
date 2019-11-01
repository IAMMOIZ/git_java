class A
{
void test(int i)
{
System.out.println("base class test(int i)");
}
}

class O extends A
{
int test(int i,int j)
{
System.out.println("drive class test(int i)");
return 8;
}

public static void main(String gg[])
{
O obj = new O();
obj.test(10);
}
}
//sigature is diffrent so it is oveloading exp