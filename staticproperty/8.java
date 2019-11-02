class ab
{
static int i = 10;
static
{
System.out.println("ab.sib");
}
}

class A
{
static
{
System.out.println("A-SIB");
}

public static void main(String gg[])
{
System.out.println(ab.i);
ab.i = 20;
System.out.println(ab.i);
}
}