class A
{
public static void test(String x, double ... y)
{
System.out.println(x);
for(double value : y)
{
System.out.println(value);
}
}
public static void main(String gg[])
{
test("abc");
System.out.println("=============");
test("abc",10.9);
System.out.println("=============");
test("abc",10.8,44.99);
System.out.println("=============");
test("abc",10.8);
System.out.println("=============");
test("abc",10.8,44.99,55.88);
System.out.println("=============");
test("abc",10.8,44.99);
}}