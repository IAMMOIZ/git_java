class abc
{
int i;//i is member of abc only
}
class A 
{
int j;
public static void main(String gg[])
{
A obj = new A();
System.out.println(obj.i);//i is not a member of class A but if we want use thn go to inheritence
System.out.println(obj.j);
System.out.println("done");
}
}