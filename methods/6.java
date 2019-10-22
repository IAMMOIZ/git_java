//call multiple methods from main
class A
{
//test1
public static void test1()
{
System.out.println("test1");
}

//test2
public static void test2()
{
System.out.println("test2");
}

//main
public static void main(String gg[])
{
System.out.println("main begin");
System.out.println("-------------");
test1();//calling test1() method
System.out.println("-------------");
test2();//calling test2() method
System.out.println("-------------");
System.out.println("main end");
}
}