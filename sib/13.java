class A
{

static int i = test();

static
{
System.out.println("sib1");
}


public static int test()
{
System.out.println("test");
return 100;
}

public static void main(String gg[])
{
System.out.println("main");
}

static 
{
System.out.println("sib2");
}
}