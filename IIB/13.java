class N
{
static int counter;

N()
{
System.out.println("default");
}

N(int i)
{
this();
System.out.println("parameterized");
}

{
counter ++;
}

public static void main(String gg[])
{
N n1 =  new N();
System.out.println(n1.counter);
System.out.println("===========");
N n2 = new N(20);
System.out.println(n2.counter);
System.out.println("===========");
N n3 = new N(40);
System.out.println(n3.counter);
System.out.println("===========");
N n4 = new N();
System.out.println(n4.counter);
}
}