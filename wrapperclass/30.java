class A
{
static void test(Integer obj)
{
System.out.println("test(Integer)");
}

static void test(Object obj)
{
System.out.println("test(Object)");
}

public static void main(String gg[])
{
byte b1 = 10;
test(b1);
System.out.println("hellow world");
}
}
//byte cannot be converted to wrapper Integer