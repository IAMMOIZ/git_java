//final refrence variable
class A
{
public static void main(String gg[])
{
A a1 = new A();
a1 = new A();
System.out.println("========");
final A a2 = new A();//error: ref variable is final declared
a2 = new A(); 
}
}