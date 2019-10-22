//use of return keyword
//return statement and return type of method should be synchronized.
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
System.out.println(test());
System.out.println("main end");
}
public static void test()
{
System.out.println("test");
return 100;//we are returning integer type values 
}
}
//error:-returning 100 but returntype is void
/*
10.java:8: error: 'void' type not allowed here
System.out.println(test());
                       ^
10.java:14: error: incompatible types: unexpected return value
return 100;//we are returning integer type values
       ^
2 errors
*/