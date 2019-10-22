//use of return keyword
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
system.out.println(test());//sop required some value to be print but test is not returning anything.
System.out.println("main end");
}
public static void test()
{
System.out.println("test");
return; //we are not returning anything so returntype of test is void .
}
}

//error
/*
9.java:7: error: 'void' type not allowed here
system.out.println(test());//sop required some value to be print but test is not returning anything.
                       ^
9.java:7: error: package system does not exist
system.out.println(test());//sop required some value to be print but test is not returning anything.
      ^
2 errors*/