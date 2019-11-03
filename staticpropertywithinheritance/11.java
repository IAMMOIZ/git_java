class ab
{
ab()
{
System.out.println("ab()");
}

{
System.out.println("ab-iib");
}

ab(int i)
{
this();
System.out.println("ab(int i)");
}
}

class abc extends ab
{
abc()
{
this(7);
System.out.println("abc()");
}

{
System.out.println("abc-iib");
}

abc(int i)
{
System.out.println("abc(int i)");
}
}

class abcd extends abc
{
abcd()
{
super(7);
System.out.println("abcd()");
}

{
System.out.println("abcd-iib");
}

abcd(int i)
{
System.out.println("abcd(int i)");
}
}

class A extends abcd
{

{
System.out.println("A-iib");
}

A(int i)
{
System.out.println("A(int i)");
}
public static void main(String gg[])
{
ab a1 = new ab();
System.out.println("=================");
ab a2 = new ab(5);
System.out.println("=================");
abc a3 = new abc(5);
System.out.println("=================");
abc a4 = new abc();
System.out.println("=================");
abcd a5 = new abcd();
System.out.println("=================");
abcd a6 = new abcd(5);
System.out.println("=================");
//A a7 = new A();//we cannot defined this type of obj. bcz there is no default constructor inside A class
System.out.println("=================");
A a7 = new A(5);}
}