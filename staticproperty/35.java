class A
{

static int i =test();

public static int test()
{
System.out.println("test"+i);
return 100;
}

public static void main(String gg[])
{
System.out.println("main "+i);
}
}
//all initializer are executing before main method.
//main method contains customer request resources.