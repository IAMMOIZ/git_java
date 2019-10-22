//use of return keyword
//return type should be same as function return statement.
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
System.out.println(test());
System.out.println("main end");
}
public static int test()//return type is same as return statement.
{
System.out.println("test");
return 100; //we are returning  100 as int type value
}
}