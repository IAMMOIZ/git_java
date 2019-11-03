class ab
{
static
{
System.out.println("static-ab");
}
}

class abc extends ab
{
static
{
System.out.println("static-abc");
}
}

class A extends abc
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
//while loading subclass jvm first load superclasses 