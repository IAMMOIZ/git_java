//return stmt inside if-else
//we can provide return stmt inside if else.
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
System.out.println(test());
System.out.println("main end");
}
public static int test()
{
System.out.println("test");
if(false)
{
return 100;
}
else
{
return 150;
}
}

}