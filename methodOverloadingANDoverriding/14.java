class A
{
int test(int i)
{
System.out.println("base class test(int i)");
return 10;
}
}

class N extends A
{
public int test(int i)
{
System.out.println("drive class test(int i)");
return i;
}

public static void main(String gg[])
{
N obj = new N();
obj.test(10);
}
}
//drive class test replacing the base class test method so it will be overriding