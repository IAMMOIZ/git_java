//default constructor
class F
{
int i;

F()
{
System.out.println("constructor called");
i =22;
}

public static void main(String gg[])
{
F f1 = new F();
System.out.println(f1.i);
F f2 = new F();
System.out.println(f2.i);
F f3 = new F();
System.out.println(f3.i);
}
}