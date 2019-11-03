class A
{
final int i = 10;//if we declaring final then object should be initialized at the time of declaration 
public static void main(String gg[])
{
A a1 = new A();
a1 = new A();
a1.i=10;//error we cannot modify the final property of the object.
}
}