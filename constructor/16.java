class Q
{
Q()
{
System.out.println("default");
}
Q(int i)
{
System.out.println("parameterized");
}


public static void main(String gg[])
{
Q q1 = new Q();
System.out.println("=======");
Q q2 = new Q(5);
}
}