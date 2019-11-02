class ab
{
ab()
{
System.out.println("ab()");
}
}

class abc extends ab
{
abc()
{
System.out.println("abc()");
}

abc(int i)
{
super();
System.out.println("abc(int i)");
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
//error 
//bcz this is the last stmt of constructor abc(int i).