class ab
{
ab()
{
this(10);
}
ab(int i)
{
this();
}
}

class A
{
public static void main(String gg[])
{
System.out.println("main");
}
}

// error: recursive constructor invocation[constructor infinite loop]