//return should be the last statement of function block or any block
class A
{
public static void main()
{
System.out.println("main begin");
test();
System.out.println("main end");
}
public static int test()
{
System.out.println("test begin");
return 100;
System.out.println("test end");
}
}
//error will come if return is not last stmt
/*
17.java:14: error: unreachable statement
System.out.println("test end");
^
17.java:15: error: missing return statement
}
^
2 errors
*/