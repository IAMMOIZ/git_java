class A
{
static void test(int i)
{
System.out.println("test(int i)");
}

public static void main(String gg[])
{
test(10);//10 is int type which is required
System.out.println("-------------");
Integer obj = new Integer(90);
test(obj);//here wrapper converted to the primitive like test(obj.intValue());
test(obj.intValue());//convesion 
}
}