class A
{
static void test(Integer i)
{
System.out.println("test(Integer)");
}
public static void main(String gg[])
{
test(10);//primitive converted to the wrapper like test(new Integer(10))

System.out.println("==============");
Integer obj = new Integer(100);
test(obj);
}
}