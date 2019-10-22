//calling of non existing method
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
test()//calling non existing method.
System.out.println("main end");
}
}
/*7.java:6: error: ';' expected
test()//calling non existing method.
      ^
1 error
*/