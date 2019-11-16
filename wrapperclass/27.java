class A
{
static void test(Integer obj)
{
System.out.println("test(Integer)");
}
static void test(Byte obj)
{
System.out.println("test(Byte)");
}
public static void main(String gg[])
{
byte b1 = 10;
test(b1);
System.out.println("hellow world");
}
}
//byte cannot be converted to wrapper Integer