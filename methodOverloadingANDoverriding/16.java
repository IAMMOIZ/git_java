class A
{}

class B extends A
{}

class C extends B
{}

class M
{
B test()
{
System.out.println("M-test");
return null;
}
}

class N extends M
{
c test()//co-variant
{
System.out.println("N-test");
return null;
}
}

class O
{
public static void main(String gg[])
{
N n1 = new N();
n1.test();
System.out.println("Hellow world");
}}