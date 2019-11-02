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
this();
System.out.println("abc(int i)");
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
//bcz this is the mid stmt of constructor abc(int i).it should be the first stmt