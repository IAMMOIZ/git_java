//return stmt inside if
//it will not work.
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
if(true)
{
return 100;
}

}

}

/*
15.java:20: error: missing return statement
}
^
1 error
*/
/*
this way is not working because at least one logical way for return stnt should be available there*/