class A
{
public void test(int i)
{
System.out.println("Base class test()");
}
}

class L extends A
{
public void test(int i)
{
System.out.println("drive class test(int i)");
}


public static void main(String gg[])
{
L obj = new L();
obj.test(5);
obj.test(10);
}
}

//both base and drive test method has same signature , example of overriding