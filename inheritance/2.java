class abc
{
int i;
}
class A  extends abc
{
int j;
public static void main(String gg[])
{
A obj = new A();
System.out.println(obj.i);//i became member of class A bcz of inheritence
System.out.println(obj.j);
System.out.println("done");
}
}
//abc is called as superclass or baseclass
//A is called as drived or subclass
//throw extends keywords we can inherit class.
//  Every member in abc class is inheritated to A class[also member of class A]