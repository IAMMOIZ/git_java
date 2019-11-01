abstract class A
{
abstract void test();
}

class Q
{
void test()
{
System.out.println("test in A , implemented by q");
}

public static void main(String gg[])
{
System.out.println("hellow world");
}
}

//implimenting abstract class method in subclass is come under override.
//because of its different signature it is overloadind.