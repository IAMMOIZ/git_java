class ab
{
static
{
System.out.println("static-ab");
}
ab()
{
System.out.println("ab()");
}
}

class abc extends ab
{
static
{
System.out.println("static-abc");
}
abc()
{
System.out.println("abc()");
}
}

class A 
{
static
{
System.out.println("static-A");
}

public static void main(String gg[])
{
ab a1 = new ab();
System.out.println("================");
abc a2 = new abc();
}

}
//static block cannot inherited to subclass it calls automatically by the member of subclass throgh super constructor 
//while loading subclass jvm first load superclasses 