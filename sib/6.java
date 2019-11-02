class A
{
public static int i = test();
public static int j = test();

public static int test()
{
System.out.println("from test "+i+" , "+j);
i+=i+j+1;
j+=i+j+2;
return i + j + 3;
}

public static void main(String gg[])
{
System.out.println("main "+i+" , "+j);
}
}