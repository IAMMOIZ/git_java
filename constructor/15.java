//constructor overloading
class P
{
P(int i, int j)
{
System.out.println("int int");
}
P(int i, double j)
{
System.out.println("int double");
}
P(double i, int j)
{
System.out.println("double int");
}
P(double i, double j)
{
System.out.println("int int");
}

public static void main(String gg[])
{
P p1 = new P(3,2);
System.out.println("=================");
P p2 = new P(3,2.3);
System.out.println("=================");
P p3 = new P(3.4,2);
System.out.println("=================");
P p4 = new P(3.5,2.7);
System.out.println("=================");
}
}