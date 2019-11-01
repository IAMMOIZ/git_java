//parameterized constructor
class G
{
int i;

G(int a)
{
System.out.println("constructor called [value of argument is : "+ a+"]");
i = a;
}

public static void main(String gg[])
{
G G1 = new G(20);
System.out.println(G1.i);
System.out.println("-----------");

G G2 = new G(30);
System.out.println(G2.i);
System.out.println("-----------");

G G3 = new G(40);
System.out.println(G3.i);
System.out.println("-----------");
}
}
//we pass parameter as a argument at the time of object creation to parameterized constructor