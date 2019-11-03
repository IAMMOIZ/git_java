class ab
{
static
{
System.out.println("static-ab");
}
}

class A extends ab
{
static
{
System.out.println("static-A");
}

public static void main(String gg[])
{
System.out.println("A-main");
}
}
//static block cannot inherited to subclass it calls automatically by the member of subclass throgh super constructor  