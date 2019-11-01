class A
{
public void test(int i)
{
System.out.println("base class test(int i)");
}
}

class M extends A
{
public int test(int i)
{
System.out.println("drive class test(int i)");
return i;
}

public static void main(String gg[])
{
M obj = new M();
obj.test(10);
}
}
//while overriding a method then return type should be same otherwise we will get compile time error.