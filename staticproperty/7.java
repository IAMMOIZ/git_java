class ab
{
static int i = 10;
}

class A
{
static
{
System.out.println("SIB");
}

public static void main(String gg[])
{
System.out.println(ab.i);
ab.i = 20;
System.out.println(ab.i);
}
}