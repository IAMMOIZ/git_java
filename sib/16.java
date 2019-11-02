class A
{

static
{
i=i+10;
System.out.println("sib1 : "+i);
}


static int i = test();

public static int test()
{
System.out.println("test : "+i);
return 100;
}

public static void main(String gg[])
{
System.out.println("main");
}

static 
{
i+=30;
System.out.println("sib2 : "+i);
}
}