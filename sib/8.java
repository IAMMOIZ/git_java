class A
{
static int i =test();

public static int test()
{
System.out.println("test begin "+i);
i+=1;
main(null);
System.out.println("test end "+i);
return i+2;
}

public static void main(String gg[])
{
System.out.println("main : "+i);
i+=3;
}
}