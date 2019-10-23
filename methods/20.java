//passing parameters to a fuction
//one parameter only
class A
{
public static void main(String gg[])
{
System.out.println("main begin");
test(20);
System.out.println("main end");
}

//test
public static void test(int i)//receiver int i[]
{
System.out.println("parameter value is : "+ i);
}

}